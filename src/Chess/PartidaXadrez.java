package Chess;

import Board.Peca;
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
    public  PecaXadrez MovimentoPeca(ChessPosition anterior, ChessPosition posterior)
    {
        Posicao antes= anterior.toPosicao();
        Posicao depois= posterior.toPosicao();

        validarPosicao(antes);
        Peca pecaCapturada= fazerMovimento(antes,depois);

        return (PecaXadrez)pecaCapturada;
    }

    private Peca fazerMovimento(Posicao antes, Posicao depois)
    {
        Peca a=tabuleiro.removerPeca(antes);
        Peca d = tabuleiro.removerPeca(depois);
        tabuleiro.AlocarPeca(a,depois);
        return  d;
    }
    private void validarPosicao(Posicao posicao)
    {
        if(tabuleiro.ExistePeca(posicao))
        {
            throw new ChessException("Não existe peça na posção de origem");

        }
        if(!tabuleiro.peca(posicao).algumMovimento())
        {
            throw new ChessException("Peça sem movimentos possívies");
        }
    }

    private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca)
    {
        tabuleiro.AlocarPeca(peca,new ChessPosition(coluna,linha).toPosicao());
    }

    private void ConfigIniciais()
    {
        colocarNovaPeca('C', 1, new Torre(tabuleiro, Cor.Branco));
        colocarNovaPeca('C', 2, new Torre(tabuleiro, Cor.Branco));
        colocarNovaPeca('D', 2, new Torre(tabuleiro, Cor.Branco));
        colocarNovaPeca('E', 2, new Torre(tabuleiro, Cor.Branco));
        colocarNovaPeca('E', 1, new Torre(tabuleiro, Cor.Branco));
        colocarNovaPeca('D', 1, new Rei(tabuleiro, Cor.Branco));

        colocarNovaPeca('C', 7, new Torre(tabuleiro, Cor.Preto));
        colocarNovaPeca('C', 8, new Torre(tabuleiro, Cor.Preto));
        colocarNovaPeca('D', 7, new Torre(tabuleiro, Cor.Preto));
        colocarNovaPeca('E', 7, new Torre(tabuleiro, Cor.Preto));
        colocarNovaPeca('E', 8, new Torre(tabuleiro, Cor.Preto));
        colocarNovaPeca('D', 8, new Rei(tabuleiro, Cor.Preto));
    }

}
