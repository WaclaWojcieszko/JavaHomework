package org.wojcieszko.ticTacToe.controllers;

import org.wojcieszko.ticTacToe.model.Board;
import org.wojcieszko.ticTacToe.model.TicTac;

import java.util.Scanner;

public class ControllerAI1 implements IStrategy {

    @Override
    public boolean makeMove(Board board, TicTac playerSymbol) {

        while (true) {

            for (int x = 0; x < board.getData().length; ++x) {
                for (int y = 0; y < board.getData().length; ++y) {

                    if (board.getData(x, y) == TicTac.EMPTY) {
                        board.setData(x, y, playerSymbol);
                        return true;

                    }
                }
            }


        }

    }
}
