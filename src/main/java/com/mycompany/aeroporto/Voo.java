/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeroporto;

/**
 *
 * @author wellington
 */
public class Voo {
    private String numeroIdentificacao;
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoDestino;
    private StatusVoo status;

    public Voo(String numeroIdentificacao, Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.status = StatusVoo.PENDENTE;
    }

    // Getters e Setters

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public Aeroporto getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public Aeroporto getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(Aeroporto aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }

    public StatusVoo getStatus() {
        return status;
    }

    public void setStatus(StatusVoo status) {
        this.status = status;
    }
    
    // Enumerador EstadoPista
    public enum EstadoPista {
    DISPONIVEL,
    OCUPADA,
    EM_MANUTENCAO
}
    
    // Enumerador StatusVoo
    public enum StatusVoo {
    PENDENTE,
    APROVADO,
    CANCELADO,
    CONCLUIDO
}
}
