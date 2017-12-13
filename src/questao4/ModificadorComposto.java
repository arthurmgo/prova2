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
public class ModificadorComposto{
    
    private String nomeFantasia;
    private Composto composto;
    
    public ModificadorComposto(Composto composto){
        this.composto = composto;
    }
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Composto getComposto() {
        return composto;
    }

    public void setComposto(Composto composto) {
        this.composto = composto;
    }
    
    
}
