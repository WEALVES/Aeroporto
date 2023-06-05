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
public class Radar {
    private List<Aeronave> aeronavesDetectadas;

    public Radar() {
        this.aeronavesDetectadas = new ArrayList<>();
    }

    // Getters e Setters

    public List<Aeronave> getAeronavesDetectadas() {
        return aeronavesDetectadas;
    }

    public void setAeronavesDetectadas(List<Aeronave> aeronavesDetectadas) {
        this.aeronavesDetectadas = aeronavesDetectadas;
    }

    //  métodos
    public void adicionarAeronave(Aeronave aeronave) {
        aeronavesDetectadas.add(aeronave);
    }

    public void removerAeronave(Aeronave aeronave) {
        aeronavesDetectadas.remove(aeronave);
    }
}
