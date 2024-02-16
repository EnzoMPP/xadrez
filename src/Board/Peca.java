package Board;

public class Peca {
    protected  Posicao posicao;
    protected Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.posicao=null;
        this.tabuleiro = tabuleiro;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
