/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufop.padroes.decorator;

/**
 *
 * @author jean, Arthur
 */
public class CoquetelBasico {
    
    private final int quantCachaca;
    private int quantPedrasGelo;
    private int quantLeiteCoco;
    
    public CoquetelBasico(){
        quantCachaca = 100;
        quantPedrasGelo = 2;
        quantLeiteCoco = 50;
    }

    public int getQuantCachaca() {
        return quantCachaca;
    }

    public int getQuantPedrasGelo() {
        return quantPedrasGelo;
    }

    public int getQuantLeiteCoco() {
        return quantLeiteCoco;
    }
    
    protected void setQuantPedrasGelo(int quantPedras){
        quantPedrasGelo = quantPedras;
    }
    
    protected void setQuantLeiteCoco(int quantLeiteCoco) {
        this.quantLeiteCoco = quantLeiteCoco;
    }
}

