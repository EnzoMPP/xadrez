package Aplicação;

import Board.Peca;
import Chess.PecaXadrez;

public class Ui
{
    public static void mostrarTabuleiro(PecaXadrez[][] pecas)
    {
        for(int i=0; i<pecas.length;i++)
        {
            System.out.print((8-i) +" " );
            for(int j=0;j<pecas.length;j++)
            {
                mostrarPeca(pecas [i][j]);

            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");

    }
    public static void mostrarPeca(PecaXadrez pecas)
    {
        if(pecas==null)
        {
            System.out.print('-');
        }
        else
        {
            System.out.print(pecas);
        }
        System.out.print(' ');
    }


}
