package Chess;

import Board.Posicao;

public class ChessPosition {
    private char coluna;
    private int linha;

    public ChessPosition(char coluna, int linha)
    {
        if(coluna < 'A' || coluna > 'H' || linha<1 || linha>8)
        {
            throw new ChessException("Posição inexistente/ apenas de a1 até h8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    protected Posicao toPosicao()
    {
        return new Posicao(8-this.linha,coluna-'A' );
    }

    protected static ChessPosition fromPosicao(Posicao posicao)
    {
        return new ChessPosition((char)('A' - posicao.getColuna()),8- posicao.getLinha());
    }

    @Override
    public String toString() {
        return ""+ coluna + linha;
    }

}
