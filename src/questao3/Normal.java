package questao3;


public class Normal extends Categoria {

    @Override
    public float precoLocacao(float p) {
        return p*0.001f;
    }

    @Override
    public int tempoAlocado() {
        return 108;
    }
}

