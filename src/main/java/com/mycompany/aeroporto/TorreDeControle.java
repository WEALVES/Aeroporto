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
public class TorreDeControle extends ElementoAeroporto {
    
    private List<Controlador> controladores;
    private Radar radar;

    public TorreDeControle() {
        super("Torre");
        this.controladores = new ArrayList<>();
        this.radar = new Radar();
    }

    // Getters e Setters

    public List<Controlador> getControladores() {
        return controladores;
    }

    public void setControladores(List<Controlador> controladores) {
        this.controladores = controladores;
    }

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    // Outros métodos
    public void adicionarControlador(Controlador controlador) {
        controladores.add(controlador);
    }

    public void removerControlador(Controlador controlador) {
        controladores.remove(controlador);
    }

    public void solicitarProcedimentosPousoDecolagem(Aeronave aeronave) {

    }

    public void obterInformacoesRadar() {

    }
    
    
}