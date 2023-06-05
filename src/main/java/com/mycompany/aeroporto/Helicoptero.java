/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeroporto;

/**
 *
 * @author wellington
 */
public class Helicoptero extends Aeronave {
    
    public Helicoptero(String numeroIdentificacao) {
        super(numeroIdentificacao, TipoAeronave.HELICOPTERO);
    }
    // Implementação dos métodos abstratos da classe Aeronave
    @Override
    public void pousar() {
        System.out.println("Helicoptero pousando...");
    }

    @Override
    public void decolar() {
        System.out.println("Helicoptero decolando...");
    }

    @Override
    public void solicitarInformacoesTorreControle() {
        // Lógica para o helicóptero solicitar informações à torre de controle
    }
}
