package Board;

public abstract class Peca {
    protected  Posicao posicao;
    protected Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.posicao=null;
        this.tabuleiro = tabuleiro;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    public abstract boolean[][] movimentosPossiveis();

    public boolean movimentoPossvel(Posicao posicao)
    {
        return movimentosPossiveis()[posicao.getLinha()][posicao.getColuna()];
    }

    public boolean algumMovimento()
    {
        boolean[][] mat = movimentosPossiveis();
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j< mat.length;j++)
            {
                if(mat[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }


}
