package Aplicação;

import Board.Peca;
import Chess.ChessPosition;
import Chess.Cor;
import Chess.PecaXadrez;

import java.util.Scanner;

public class Ui
{


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static ChessPosition LerPosicao  (Scanner sc)
    {
        try {
            String s = sc.nextLine();
            char coluna = s.charAt(0);
            int Linha = Integer.parseInt(s.substring(1));
            return new ChessPosition(coluna, Linha);
        }
        catch (RuntimeException e)
        {
            throw new IndexOutOfBoundsException("Erro lendo posição de xadrez, a1 até h8");
        }


    }

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
            if(pecas.getCor()== Cor.Branco) {
                System.out.print (ANSI_WHITE + pecas + ANSI_RESET);
            }
            else
            {
                System.out.print(ANSI_YELLOW + pecas + ANSI_RESET);

            }
        }

        System.out.print(' ');
    }


}
