/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufop.padroes.brigde;

/**
 *
 * @author jean, Arthur
 */
public class Liquido extends Composto{
    private int tamVidro;

    public Liquido(String nomeGenerico,String dataFabricacao, int validade, String finalidade) {
        super(nomeGenerico,dataFabricacao, validade, finalidade);
    }

    public int getTamVidro() {
        return tamVidro;
    }

    public void setTamVidro(int tamVidro) {
        this.tamVidro = tamVidro;
    }
    
    
    
}
