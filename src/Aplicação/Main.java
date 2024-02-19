package Aplicação;

import Board.Tabuleiro;
import Chess.PartidaXadrez;

public class Main {
    public static void main(String[] args)
    {

        PartidaXadrez partida= new PartidaXadrez();
        Ui.mostrarTabuleiro(partida.getPecas());

    }
}