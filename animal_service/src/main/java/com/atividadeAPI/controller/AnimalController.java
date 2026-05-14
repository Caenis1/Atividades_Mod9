package com.atividadeAPI.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atividadeAPI.DTO.QuantidadeResgateDTO;
import com.atividadeAPI.entidades.Animal;
import com.atividadeAPI.repositórios.AnimalRepository;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll(){

        return repository.findAll();

    }

    @PostMapping
    private Animal create (@RequestBody Animal animal){

        return repository.save(animal);

    }

    @GetMapping("/nao-adotados")
    private List<Animal> findNotAdoptedAnimals() {
        return repository.findNotAdoptedAnimals();
    }

    @GetMapping("/resgates")
    public List<QuantidadeResgateDTO> quantidadeResgates(
            @RequestParam
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date inicio,

            @RequestParam
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date fim
    ) {

        long diferenca = fim.getTime() - inicio.getTime();

        long dias = diferenca / (1000 * 60 * 60 * 24);

        if (dias > 365) {
            throw new RuntimeException(
                    "O intervalo máximo permitido é de 1 ano."
            );
        }

        return repository.quantidadeAnimaisResgatados(
                inicio,
                fim
        );
    }


}
