package questao3;

public class GAME extends Midia {
    private String console;

    public GAME(Categoria categoria) {
        super(categoria);
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
