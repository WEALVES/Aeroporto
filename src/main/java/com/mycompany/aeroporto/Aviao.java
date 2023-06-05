/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aeroporto;

/**
 *
 * @author wellington
 */
public class Aviao extends Aeronave {
    public Aviao(String numeroIdentificacao) {
        super(numeroIdentificacao, TipoAeronave.ASA_FIXA);
    }

    @Override
    public void pousar() {
        System.out.println("Avião pousando...");
    }

    @Override
    public void decolar() {
        System.out.println("Avião decolando...");
    }


    @Override
    public void solicitarInformacoesTorreControle() {
    }
}
