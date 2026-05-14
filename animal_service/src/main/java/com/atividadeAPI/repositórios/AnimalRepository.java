package com.atividadeAPI.repositórios;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.atividadeAPI.DTO.QuantidadeResgateDTO;
import com.atividadeAPI.entidades.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada DESC")
    List<Animal> findNotAdoptedAnimals();

    @Query("""
        SELECT new com.atividadeAPI.DTO.QuantidadeResgateDTO(
            a.nomeRecebedor,
            COUNT(a)
        )
        FROM Animal a
        WHERE a.dataEntrada BETWEEN :inicio AND :fim
        GROUP BY a.nomeRecebedor
    """)
    List<QuantidadeResgateDTO> quantidadeAnimaisResgatados(
            @Param("inicio") Date inicio,
            @Param("fim") Date fim
    );
}


