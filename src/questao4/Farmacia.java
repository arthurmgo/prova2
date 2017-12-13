/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.ArrayList;

/**
 *
 * @author jean, Arthur
 */
public class Farmacia {
    
    private ArrayList<Composto> compostosFabricados;
    private ModificadorComposto compostoproprio;
    private String nomeEmpresa;

    
    public Farmacia(ModificadorComposto m){
        compostoproprio = m;
    }
    
     public ModificadorComposto getCompostoproprio() {
        return compostoproprio;
    }

    public void setCompostoproprio(ModificadorComposto compostoproprio) {
        this.compostoproprio = compostoproprio;
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
}
