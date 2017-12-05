/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.Date;

/**
 *
 * @author arthu
 */
public class FachadaControleVagas {
    private Cliente cli;
    private Vaga vaga;

    public FachadaControleVagas(Cliente cli, Vaga vaga) {
        this.cli = cli;
        this.vaga = vaga;
    }
    
    public final String getPlacaCarro(){
        return this.cli.getPlaca();
    }
    
    public final void setPlacaCarro(String placa){
        this.cli.setPlaca(placa);
    }
    
    public final int getNumeroVaga(){
        return this.vaga.getNumero();
    }
    
    public final void setNumeroVaga(int numero){
        this.vaga.setNumero(numero);
    }
    
    public final Date getEntradaVaga(){
        return this.vaga.getEntrada();
    }
    
    public final void setEntradaVaga(Date d){
        this.vaga.setEntrada(d);
    }
}
