package questao1;

/**
 *
 * @author arthu
 */
public class PrimeiroGrau extends Funcao {

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double valorY(double x) {
        return this.a  * x + this.b;
    }
}
