package Pecas.Xadrez;

import Board.Tabuleiro;
import Chess.Cor;
import Chess.PecaXadrez;

public class Rei extends PecaXadrez{
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "R";
    }
}
