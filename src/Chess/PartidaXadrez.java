package Chess;

import Board.Posicao;
import Board.Tabuleiro;
import Pecas.Xadrez.Rei;
import Pecas.Xadrez.Torre;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public PartidaXadrez() {
        tabuleiro=new Tabuleiro(8,8);
        ConfigIniciais();
    }

    public PecaXadrez[][] getPecas()
    {
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];

        for(int i=0;i<tabuleiro.getLinhas();i++)
        {
            for(int j=0; j< tabuleiro.getColunas();j++)
            {
                mat[i][j]= (PecaXadrez) tabuleiro.peca(i,j);
            }
        }
        return  mat;

    }

    private void ConfigIniciais()
    {
        tabuleiro.AlocarPeca(new Torre(tabuleiro,Cor.Branco),new Posicao(1,1));
        tabuleiro.AlocarPeca(new Rei(tabuleiro,Cor.Preto),new Posicao(7,4));
        tabuleiro.AlocarPeca(new Rei(tabuleiro,Cor.Branco),new Posicao(0,4));
    }

}
