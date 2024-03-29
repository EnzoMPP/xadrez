package Pecas.Xadrez;

import Board.Tabuleiro;
import Chess.Cor;
import Chess.PecaXadrez;

public class Torre extends PecaXadrez {
    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "T";
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean [][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        return mat;
    }
}
