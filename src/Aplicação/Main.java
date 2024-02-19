package Aplicação;

import Board.Peca;
import Board.Tabuleiro;
import Chess.ChessException;
import Chess.ChessPosition;
import Chess.PartidaXadrez;
import Chess.PecaXadrez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        PartidaXadrez partida= new PartidaXadrez();
        while (true) {
            Ui.mostrarTabuleiro(partida.getPecas());
            System.out.println();
            System.out.println("Source");
            ChessPosition source= Ui.LerPosicao(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target= Ui.LerPosicao(sc);

            PecaXadrez pecaCapturada= partida.MovimentoPeca(source,target);
        }

    }
}