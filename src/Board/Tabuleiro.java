package Board;

public class Tabuleiro {
    private  int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if(linhas<1 || colunas<1)
        {
            throw  new BoardException("Erro criando tabuleiro, é nexessário pelo menos uma linha e uma coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas =new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }


    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linhas, int colunas)
    {
        if(! posicaoExistente(linhas,colunas))
        {
            throw new BoardException("Posição inexistente");
        }
        return pecas[linhas][colunas];
    }

        public Peca peca(Posicao posicao)
        {
            if(! posicaoExistente(posicao))
            {
                throw new BoardException("Posição inexistente");
            }
            return pecas[posicao.getLinha()][posicao.getColuna()];
        }

    public void AlocarPeca(Peca peca, Posicao posicao)
    {
      if(!ExistePeca(posicao))
        {
            throw new BoardException("Posição já ocupada");
        }

        pecas[posicao.getLinha()][posicao.getColuna()]=peca;
        peca.posicao=posicao;

    }

    public Peca removerPeca(Posicao posicao)
    {
        if(!posicaoExistente(posicao))
        {
            throw new BoardException("Posição inexistente");
        }
        if(peca(posicao)==null)
        {
            return null;
        }
        Peca aux= peca(posicao);
        aux.posicao=null;
        pecas[posicao.getLinha()][posicao.getColuna()]=null;
        return aux;
    }
    public boolean posicaoExistente( int linha, int coluna)
    {

        return linha>=0 && linha<this.linhas && coluna >=0 && coluna < this.colunas;
    }
   public boolean posicaoExistente(Posicao posicao)
    {
       return posicaoExistente(posicao.getLinha(),posicao.getColuna());

    }

    public boolean ExistePeca(Posicao posicao)
    {
        if(!posicaoExistente(posicao))
        {
            throw new BoardException("Posição inexistente");
        }

        return  peca(posicao) == null;
    }
}
