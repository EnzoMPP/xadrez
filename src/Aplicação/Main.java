package Aplicação;

import Board.Peca;
import Board.Tabuleiro;
import Chess.ChessException;
import Chess.ChessPosition;
import Chess.PartidaXadrez;
import Chess.PecaXadrez;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        PartidaXadrez partida= new PartidaXadrez();
        while (true) {
            try {
                Ui.clearScreen();
                Ui.mostrarTabuleiro(partida.getPecas());
                System.out.println();
                System.out.println("Source");
                ChessPosition source = Ui.LerPosicao(sc);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = Ui.LerPosicao(sc);

                PecaXadrez pecaCapturada = partida.MovimentoPeca(source, target);
            }
            catch (ChessException e)
            {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e)
            {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

    }
}