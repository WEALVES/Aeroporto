/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeroporto;

/**
 *
 * @author wellington
 */
    public abstract class ElementoAeroporto {
    private String numeroIdentificacao;
    private String nome;
    private Aeroporto aeroportoAssociado;

    public ElementoAeroporto(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    // Getters e Setters

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aeroporto getAeroportoAssociado() {
        return aeroportoAssociado;
    }

    public void setAeroportoAssociado(Aeroporto aeroportoAssociado) {
        this.aeroportoAssociado = aeroportoAssociado;
    }
}