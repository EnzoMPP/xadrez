package Chess;

import Board.Peca;
import Board.Tabuleiro;

public abstract class PecaXadrez extends Peca {
    private Cor cor;


    public PecaXadrez(Tabuleiro tabuleiro,Cor cor) {
        super(tabuleiro);
        this.cor=cor;
    }

    public Cor getCor() {
        return cor;
    }
}
