package com.atividadeAPI.entidades;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder.In;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data_entrada", nullable = false)
    private Date dataEntrada;

    @Column(name = "data_adocao")
    private Date dataAdocao;

    @Column(name = "condicoes_chegada")
    private String condicoesChegada;

    @Column(name = "nome_recebedor")
    private String nomeRecebedor;

    @Column(name = "data_quite")
    private Date dataQuite;

    @Column(name = "porte", nullable = false)
    private String porte;

    @Column(name = "nome_provisorio", nullable = false)
    private String nomeProvisorio;

    @Column(name = "idade_estimada", nullable = false)
    private Integer idadeEstiimada;

    @Column(name = "raca", nullable = false)
    private String raca;


    

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Date getDataQuite() {
        return dataQuite;
    }

    public void setDataQuite(Date dataQuite) {
        this.dataQuite = dataQuite;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Long getId() {
        return id;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public Integer getIdadeEstiimada() {
        return idadeEstiimada;
    }

    public void setIdadeEstiimada(Integer idadeEstiimada) {
        this.idadeEstiimada = idadeEstiimada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

  

}
