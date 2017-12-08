package questao3;

/**
 *
 * @author arthu
 */
public class SuperLancamento extends Categoria {


    @Override
    public float precoLocacao(float p) {
        return p*0.01f;
    }


    @Override
    public int tempoAlocado() {
        return 24;
    }
}
