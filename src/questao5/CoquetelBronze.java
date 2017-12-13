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
public class CoquetelBronze extends Conector{
    private int quantLeiteCondensado;
    private int quantGuarana;
    
    public CoquetelBronze(CoquetelBasico coquetelBasico){
        super(coquetelBasico);
        super.setQuantLeiteCoco(100);
        quantLeiteCondensado = 20;
        quantGuarana = 100;
    }

    public int getQuantLeiteCondensado() {
        return quantLeiteCondensado;
    }

    public int getQuantGuarana() {
        return quantGuarana;
    }
    
    
}
