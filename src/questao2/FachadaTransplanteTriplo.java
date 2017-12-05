
package questao2;


/**
 *
 * @author arthu
 */
public class FachadaTransplanteTriplo {

    private Rim rim;
    private Coracao coracao;
    private Pulmao pulmao;

    public FachadaTransplanteTriplo(Rim rim, Coracao coracao, Pulmao pulmao) {
        this.rim = rim;
        this.coracao = coracao;
        this.pulmao = pulmao;
    }

    public final int gettamRim(){
        return rim.getTamanho();
    }

    public final int getladoRim(){
        return rim.getLado();
    }

    public final int gettamPulmao(){
        return pulmao.getTamanho();
    }

    public final int getladoPulmao(){
        return pulmao.getLado();
    }

    public final int gettamCoracao(){
        return coracao.getTamanho();
    }


    public final void settamRim(int x){
        rim.setTamanho(x);
    }

    public final void setladoRim(int x){
        rim.setLado(x);
    }

    public final void settamPulmao(int x){
        pulmao.setTamanho(x);
    }

    public final void setladoPulmao(int x){
        pulmao.setLado(x);
    }

    public final void settamCoracao(int x){
        coracao.setTamanho(x);
    }





}
