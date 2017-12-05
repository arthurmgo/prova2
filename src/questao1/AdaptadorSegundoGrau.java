package questao1;

/**
 *
 * @author arthur
 */
public class AdaptadorSegundoGrau  extends Funcao{
    private SegundoGrau sg = new SegundoGrau();

    public void setA(double a){
        sg.setA(a);
    }

    public void setB(double b){
        sg.setB(b);
    }

    public void setC(double c){
        sg.setC(c);
    }

    public double getA(){
        return sg.getA();
    }

    public double getB(){
        return sg.getB();
    }

    public double getC(){
        return sg.getC();
    }


    @Override
    public double valorY(double x) {
        return sg.calculaY(x);
    }
}

