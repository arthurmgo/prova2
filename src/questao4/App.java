/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author jean, Arthur
 */
public class App {
    public static void main(String[] args) {
        //cria Farmacia 1
        Comprimido c1 = new Comprimido("papepipoco","Desconhecida",15,"Dor de Cabeca");
        c1.setComprimidosPorCartela(30);
        ModificadorComposto m1 = new ModificadorComposto(c1);
        m1.setNomeFantasia("papepil");
        Farmacia custaCaro = new Farmacia(m1);
        custaCaro.setNomeEmpresa("Custacaro");
        c1.setComprimidosPorCartela(30);
        
        //Farmacia 2
        
        Liquido l1 = new Liquido("gragregrigropo","Desconhecido",6,"Desconhecido");
        l1.setTamVidro(15);
        ModificadorComposto m2 = new ModificadorComposto(l1);
        m2.setNomeFantasia("gragregril");
        Farmacia Muitocaro = new Farmacia(m2);
        Muitocaro.setNomeEmpresa("MuitoCaro");
        
        
        
        //imprimindo dados farmacia 1 e compostos fabricados por ela
        System.out.println("Farmacia 1:\n");
        System.out.println("Nome:"+ custaCaro.getNomeEmpresa());
        System.out.println("Composto Proprio fabricado:\n");
        System.out.println("Nome Fantasia: "+ custaCaro.getCompostoproprio().getNomeFantasia());
        System.out.println("Nome generico: "+custaCaro.getCompostoproprio().getComposto().getNomeGenerico());
        System.out.println("Data Fabricacao: "+custaCaro.getCompostoproprio().getComposto().getDataFabricacao());
        System.out.println("Validade apos fabricacao: "+custaCaro.getCompostoproprio().getComposto().getValidade());
        System.out.println("Finalidade: "+custaCaro.getCompostoproprio().getComposto().getFinalidade());
        System.out.println("Comprimidos por cartela: "+ ((Comprimido)(custaCaro.getCompostoproprio().getComposto())).getComprimidosPorCartela());
        
        System.out.println("\n\n\n");
       //imprimindo dados farmacia 2 e compostos fabricados por ela
        System.out.println("Farmacia 2:\n");
        System.out.println("Nome:"+ Muitocaro.getNomeEmpresa());
        System.out.println("Composto Proprio fabricado:\n");
        System.out.println("Nome Fantasia: "+ Muitocaro.getCompostoproprio().getNomeFantasia());
        System.out.println("Nome generico: "+Muitocaro.getCompostoproprio().getComposto().getNomeGenerico());
        System.out.println("Data Fabricacao: "+Muitocaro.getCompostoproprio().getComposto().getDataFabricacao());
        System.out.println("Validade apos fabricacao: "+Muitocaro.getCompostoproprio().getComposto().getValidade());
        System.out.println("Finalidade: "+Muitocaro.getCompostoproprio().getComposto().getFinalidade());
        System.out.println("Tamanho do vidro: "+ ((Liquido)(Muitocaro.getCompostoproprio().getComposto())).getTamVidro());
        
        
    }
}
