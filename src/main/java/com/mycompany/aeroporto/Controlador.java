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
    public class Controlador {
    private String nome;
    private List<Aeronave> aeronavesAutorizadas;

    public Controlador(String nome) {
        this.nome = nome;
        this.aeronavesAutorizadas = new ArrayList<>();
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aeronave> getAeronavesAutorizadas() {
        return aeronavesAutorizadas;
    }

    public void setAeronavesAutorizadas(List<Aeronave> aeronavesAutorizadas) {
        this.aeronavesAutorizadas = aeronavesAutorizadas;
    }

    //  métodos
    public void autorizarDecolagem(Aeronave aeronave) {
        aeronavesAutorizadas.add(aeronave);
    }

    public void cancelarDecolagem(Aeronave aeronave) {
        aeronavesAutorizadas.remove(aeronave);
    }

    public void autorizarPouso(Aeronave aeronave) {
        aeronavesAutorizadas.add(aeronave);
    }

    public void cancelarPouso(Aeronave aeronave) {
        aeronavesAutorizadas.remove(aeronave);
    }
}

