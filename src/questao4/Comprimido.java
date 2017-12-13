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
public class Comprimido extends Composto {
    private int comprimidosPorCartela;
    
    public Comprimido(String nomeGenerico, String dataFabricacao, int validade, String finalidade) {
        super(nomeGenerico,dataFabricacao, validade, finalidade);
    }

    public void setComprimidosPorCartela(int comprimidosPorCartela) {
        this.comprimidosPorCartela = comprimidosPorCartela;
    }

    public int getComprimidosPorCartela() {
        return comprimidosPorCartela;
    }
    
    
}
