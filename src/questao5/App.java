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
public class App {
    
    public static void main(String[] args) {
        //Cria um coquetel Basico
        CoquetelBasico coquetelBasico = new CoquetelBasico();
        System.out.println("Coquetel Basico:\n");
        System.out.println("Quantidade cachaca: "+coquetelBasico.getQuantCachaca());
        System.out.println("Quantidade pedras de Gelo: "+ coquetelBasico.getQuantPedrasGelo());
        System.out.println("Quantidade leite de coco: "+coquetelBasico.getQuantLeiteCoco());
        System.out.println("\n\n");
        
         //modifica Coquetel Basico para Coquetel Prata
        CoquetelBasico coquetelBasico2 = new CoquetelBasico();
        CoquetelPrata coquetelPrata= new CoquetelPrata(coquetelBasico2);
        System.out.println("Coquetel Prata:\n");
        System.out.println("Quantidade cachaca: "+coquetelPrata.getQuantCachaca());
        System.out.println("Quantidade pedras de Gelo: "+ coquetelPrata.getQuantPedrasGelo());
        System.out.println("Quantidade leite de coco: "+coquetelPrata.getQuantLeiteCoco());
        System.out.println("Quantidade leite Condensado: "+coquetelPrata.getQuantLeiteCondensado());
        System.out.println("Quantidade abacaxi: "+coquetelPrata.getQuantAbacaxi());
        
        System.out.println("\n\n");
        //modifica Coquetel Basico para Coquetel Ouro
        CoquetelBasico coquetelBasico3 = new CoquetelBasico();
        CoquetelOuro coquetelOuro = new CoquetelOuro(coquetelBasico3);
        System.out.println("Coquetel Ouro:\n");
        System.out.println("Quantidade cachaca: "+coquetelOuro.getQuantCachaca());
        System.out.println("Quantidade pedras de Gelo: "+ coquetelOuro.getQuantPedrasGelo());
        System.out.println("Quantidade leite de coco: "+coquetelOuro.getQuantLeiteCoco());
        System.out.println("Quantidade leite Condensado: "+coquetelOuro.getQuantLeiteCondensado());
        System.out.println("Quantidade abacaxi: "+coquetelOuro.getQuantAbacaxi());
        System.out.println("Quantidade Marshmallow: "+coquetelOuro.getMarshmallow());
        System.out.println("Quantidade Cereja: "+ coquetelOuro.getCereja());
        System.out.println("Quantidade Guarda Chuva: "+coquetelOuro.getGuardaChuva());
        
        System.out.println("\n\n");
        //modifica Coquetel Basico para Coquetel Bronze
        CoquetelBasico coquetelBasico4 = new CoquetelBasico();
        CoquetelBronze coquetelBronze = new CoquetelBronze(coquetelBasico4);
        System.out.println("Coquetel Bronze:\n");
        System.out.println("Quantidade cachaca: "+coquetelBronze.getQuantCachaca());
        System.out.println("Quantidade pedras de Gelo: "+ coquetelBronze.getQuantPedrasGelo());
        System.out.println("Quantidade leite de coco: "+coquetelBronze.getQuantLeiteCoco());
        System.out.println("Quantidade leite Condensado: "+coquetelBronze.getQuantLeiteCondensado());
        System.out.println("Quantidade guarana: "+coquetelBronze.getQuantGuarana());
        System.out.println("\n\n");
        
    }
    
}
