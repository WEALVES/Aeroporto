/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeroporto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wellington
 */
    public abstract class Aeronave {
    private String numeroIdentificacao;
    private TipoAeronave tipoAeronave;
    private List<Piloto> pilotos;
    private int combustivel;

    public Aeronave(String numeroIdentificacao, TipoAeronave tipoAeronave) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.tipoAeronave = tipoAeronave;
        this.pilotos = new ArrayList<>();
    }

    // Getters e Setters

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public TipoAeronave getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(TipoAeronave tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
    
    // Enumerador TipoAeronave
    public enum TipoAeronave {
    ASA_FIXA,
    HELICOPTERO
}

    // Métodos abstratos
    public abstract void pousar();
    public abstract void decolar();
    public abstract void solicitarInformacoesTorreControle();
}
