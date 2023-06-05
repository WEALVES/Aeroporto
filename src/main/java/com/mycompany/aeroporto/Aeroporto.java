/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aeroporto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wellington
 */
public abstract class Aeroporto extends ElementoAeroporto {
    private List<Pista> pistas;
    private List<Terminal> terminais;
    private List<Hangar> hangares;
    private TorreDeControle torreDeControle;

    public Aeroporto(String numeroIdentificacao) {
        super(numeroIdentificacao);
        this.pistas = new ArrayList<>();
        this.terminais = new ArrayList<>();
        this.hangares = new ArrayList<>();
        this.torreDeControle = new TorreDeControle();
    }

    // Getters e Setters

    public List<Pista> getPistas() {
        return pistas;
    }

    public void setPistas(List<Pista> pistas) {
        this.pistas = pistas;
    }

    public List<Terminal> getTerminais() {
        return terminais;
    }

    public void setTerminais(List<Terminal> terminais) {
        this.terminais = terminais;
    }

    public List<Hangar> getHangares() {
        return hangares;
    }

    public void setHangares(List<Hangar> hangares) {
        this.hangares = hangares;
    }

    public TorreDeControle getTorreDeControle() {
        return torreDeControle;
    }

    public void setTorreDeControle(TorreDeControle torreDeControle) {
        this.torreDeControle = torreDeControle;
    }

    public abstract void adicionarPista(Pista pista);
    public abstract void removerPista(Pista pista);
    public abstract void adicionarTerminal(Terminal terminal);
    public abstract void removerTerminal(Terminal terminal);
    public abstract void adicionarHangar(Hangar hangar);
    public abstract void removerHangar(Hangar hangar);
}
