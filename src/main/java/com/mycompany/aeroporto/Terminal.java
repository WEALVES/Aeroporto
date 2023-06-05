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
public class Terminal extends ElementoAeroporto {
    private int capacidade;
    private List<Voo> voos;

    public Terminal(String numeroIdentificacao, int capacidade) {
        super(numeroIdentificacao);
        this.capacidade = capacidade;
        this.voos = new ArrayList<>();
    }

    // Getters e Setters

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }

    //  métodos
    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public void removerVoo(Voo voo) {
        voos.remove(voo);
    }

    public void embarcarPassageiros() {
    }

    public void desembarcarPassageiros() {
    }
    
    public void removerTerminal(Terminal terminal) {
    //        Aeroporto aeroporto = new Aeroporto(); // Crie uma instância de Aeroporto, se necessário
    //        List<Terminal> terminais = aeroporto.getTerminais();
    //        terminais.remove(terminal);
    }

    public String obterInformacoesRadar() {
    return "Informações do radar";
    }

    public void solicitarProcedimentosPousoDecolagem(Aeronave aeronave) {
    System.out.println("Solicitando procedimentos de pouso/decolagem para a aeronave " + aeronave.getNumeroIdentificacao());
    }
        }