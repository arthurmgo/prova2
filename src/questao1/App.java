package questao1;

/**
 *
 * @author arthu
 */
public class App {
    public static void main(String[] args) {
        AdaptadorSegundoGrau sg = new AdaptadorSegundoGrau();
        
        sg.setA(1);
        sg.setB(2);
        sg.setC(3);
        
        System.out.println("Segundo grau (x^2 + 2x + 3) para x = 2: " + sg.valorY(2));
    }
    
}
