package Board;

public class Posicao {
    private int Linha;
    private int Coluna;

    public Posicao(int linha, int coluna) {
        Linha = linha;
        Coluna = coluna;
    }

    public int getLinha() {
        return Linha;
    }

    public void setLinha(int linha) {
        Linha = linha;
    }

    public int getColuna() {
        return Coluna;
    }

    public void setColuna(int coluna) {
        Coluna = coluna;
    }
}
