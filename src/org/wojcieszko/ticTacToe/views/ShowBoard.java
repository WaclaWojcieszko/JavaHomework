package org.wojcieszko.ticTacToe.views;

import org.wojcieszko.ticTacToe.model.Board;
import org.wojcieszko.ticTacToe.model.TicTac;

import java.util.Observable;
import java.util.Observer;

public class ShowBoard implements Observer {

    public String toString(Board board) {
        TicTac[][] data = board.getData();
        StringBuilder result = new StringBuilder();
        for (TicTac[] row : data) {
            for (TicTac field : row) {
                result
                        .append(field.getMark())
                        .append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public void show(Board board) {
        System.out.println(toString(board));
    }

    @Override
    public void update(Observable observable, Object o) {
        if (!(observable instanceof Board)) {
            return;
        }
        Board board = (Board) observable;
        show(board);
    }
}
