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
public class CoquetelPrata extends Conector{
    
    private int quantLeiteCondensado;
    private int quantAbacaxi;
    
    public CoquetelPrata(CoquetelBasico coquetelBasico) {
        super(coquetelBasico);
        super.setQuantPedrasGelo(3);
        quantLeiteCondensado = 10;
        quantAbacaxi = 100; 
    }

    public int getQuantLeiteCondensado() {
        return quantLeiteCondensado;
    }

    public int getQuantAbacaxi() {
        return quantAbacaxi;
    }
       
}
