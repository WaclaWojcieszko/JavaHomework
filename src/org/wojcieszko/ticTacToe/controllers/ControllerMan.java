package org.wojcieszko.ticTacToe.controllers;

import org.wojcieszko.ticTacToe.model.Board;
import org.wojcieszko.ticTacToe.model.TicTac;

import java.util.Scanner;

public class ControllerMan implements IStrategy {


    @Override
    public boolean makeMove(Board board, TicTac playerSymbol) {

        System.out.println("Grasz jako: " + playerSymbol.getMark());


        while (true) {
            System.out.println("Podaj x: ");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            System.out.println("Podaj y: ");
            int y = in.nextInt();


            if (board.getData(x, y) == TicTac.EMPTY) {
                board.setData(x, y, playerSymbol);
                return true;

            }

        }

    }


}
