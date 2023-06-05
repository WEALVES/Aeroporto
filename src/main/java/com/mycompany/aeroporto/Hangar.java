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
public class Hangar extends ElementoAeroporto {
    private int capacidade;
    private List<Aeronave> aeronavesEstacionadas;

    public Hangar(String numeroIdentificacao, int capacidade) {
        super(numeroIdentificacao);
        this.capacidade = capacidade;
        this.aeronavesEstacionadas = new ArrayList<>();
    }

    // Getters e Setters

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Aeronave> getAeronavesEstacionadas() {
        return aeronavesEstacionadas;
    }

    public void setAeronavesEstacionadas(List<Aeronave> aeronavesEstacionadas) {
        this.aeronavesEstacionadas = aeronavesEstacionadas;
    }

    //  métodos
    public void adicionarAeronave(Aeronave aeronave) {
        aeronavesEstacionadas.add(aeronave);
    }

    public void removerAeronave(Aeronave aeronave) {
        aeronavesEstacionadas.remove(aeronave);
    }

    public void realizarManutencao(Aeronave aeronave) {
        System.out.println("Realizando manutenção da aeronave " + aeronave.getNumeroIdentificacao());
    }
    
    public void removerHangar(Hangar hangar) {
//        Aeroporto aeroporto = new Aeroporto() {};
//        List<Hangar> hangares = aeroporto.getHangares();
//        hangares.remove(hangar);
    }
}


