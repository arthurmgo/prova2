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
public class CoquetelOuro extends CoquetelPrata{  
    
    private int marshmallow;
    private int cereja;
    private int guardaChuva;
    
    
    public CoquetelOuro(CoquetelBasico coquetelBasico) {
        super(new CoquetelPrata(coquetelBasico));
        marshmallow = 100;
        cereja = 1;
        guardaChuva = 1;
    }

    public int getMarshmallow() {
        return marshmallow;
    }

    public int getCereja() {
        return cereja;
    }

    public int getGuardaChuva() {
        return guardaChuva;
    }
    
    
}
