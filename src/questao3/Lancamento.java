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
public class Lancamento extends Categoria {

    @Override
    public float precoLocacao(float p) {
        return p*0.005f;
    }

    @Override
    public int tempoAlocado() {
        return 60;
    }
}
