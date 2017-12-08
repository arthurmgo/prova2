/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author arthu
 */
public class App {
    
    public static void main(String[] args) {
        Normal n1 = new Normal();
        DVD d1 = new DVD(n1);
        d1.setTitulo("Harry Potter");
        d1.setPreco(10);
        System.out.println("Preco Locacao DVD Normal = " + d1.precoCategoria());

        SuperLancamento s1 = new SuperLancamento();
        DVD d2 = new DVD(s1);
        d2.setPreco(15);
        d2.setTitulo("A lagoa azul");
        System.out.println("Preco Locacao DVD SuperLancamento = " + d2.precoCategoria());


        Lancamento l1 = new Lancamento();
        GAME g1 = new GAME(l1);
        g1.setPreco(10);
        g1.setTitulo("GTA S.A");
        System.out.println("Preco Locacao GAME Lancamento = " + g1.precoCategoria());


    }
    
}
