package questao1;

/**
 *
 * @author arthur
 */
public class Exponencial extends Funcao {

    private double e = Math.E;

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    @Override
    public double valorY(double x) {
        return Math.exp(x);
    }
}
