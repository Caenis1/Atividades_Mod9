package com.atividadeAPI.DTO;

public class QuantidadeResgateDTO {

    private String nomeRecebedor;
    private Long quantidade;

    public QuantidadeResgateDTO(String nomeRecebedor, Long quantidade) {
        this.nomeRecebedor = nomeRecebedor;
        this.quantidade = quantidade;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public Long getQuantidade() {
        return quantidade;
    }
}
