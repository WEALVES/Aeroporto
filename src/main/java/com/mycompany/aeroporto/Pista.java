/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeroporto;

import com.mycompany.aeroporto.Voo.EstadoPista;

/**
 *
 * @author wellington
 */
public class Pista extends ElementoAeroporto {
    private EstadoPista estado;
    private int comprimento;

    public Pista(String numeroIdentificacao, int comprimento) {
        super(numeroIdentificacao);
        this.comprimento = comprimento;
    }

    // Getters e Setters

    public EstadoPista getEstado() {
        return estado;
    }

    public void setEstado(EstadoPista estado) {
        this.estado = estado;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    // Outros métodos
    public void alterarEstadoPista(EstadoPista estado) {
        this.estado = estado;
    }

    public boolean verificarDisponibilidade() {
        return estado == EstadoPista.DISPONIVEL;
    }
}
