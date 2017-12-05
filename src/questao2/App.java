
package questao2;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Coracao c = new Coracao();
        Pulmao p = new Pulmao();
        Rim r = new Rim();
        FachadaTransplanteTriplo f = new FachadaTransplanteTriplo(r, c, p);

        System.out.println("digite o tamanho do coracao: ");
        f.settamCoracao(s.nextInt());
        System.out.println("digite o tamanho do  pulmao: ");
        f.settamPulmao(s.nextInt());


        System.out.println("tam pulmao: " + f.gettamPulmao());
        System.out.println("tam coracao: " + f.gettamCoracao());
    }
    
}
