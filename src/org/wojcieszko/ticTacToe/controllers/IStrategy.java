package org.wojcieszko.ticTacToe.controllers;

import org.wojcieszko.ticTacToe.model.Board;
import org.wojcieszko.ticTacToe.model.TicTac;

public interface IStrategy {

    boolean makeMove(Board board, TicTac playerSymbol);



}
