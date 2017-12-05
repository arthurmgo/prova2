/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cliente c = new Cliente();
        Vaga v = new Vaga();
        FachadaControleVagas f = new FachadaControleVagas(c, v);
        System.out.println("digite a placa: ");
        f.setPlacaCarro(s.next());
        System.out.println("digite numero vaga: ");
        Date d = new Date();
        f.setEntradaVaga(d);
        f.setNumeroVaga(s.nextInt());
        System.out.println("placa: " + f.getPlacaCarro());
        System.out.println("data: " + f.getEntradaVaga().toString());
    }
    
}
