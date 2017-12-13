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
public abstract class Composto {
    private String nomeGenerico;
    private String dataFabricacao;
    private int validade;
    private String finalidade;
    
    public Composto(String nomeGenerico,String dataFabricacao,int validade,String finalidade){
        this.nomeGenerico=nomeGenerico;
        this.dataFabricacao = dataFabricacao;
        this.validade =  validade;
        this.finalidade = finalidade;
        
    }

    public String getNomeGenerico() {
        return nomeGenerico;
    }

    public void setNomeGenerico(String nomeGenerico) {
        this.nomeGenerico = nomeGenerico;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }
    
    
}
