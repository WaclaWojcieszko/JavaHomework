package org.wojcieszko.homework.homework04;

public class Model {
    final int dimX = 3;
    final int dimY = 3;

    public enum XO {YES, NO, EMPTY};

    public XO[][] board = new XO [dimX][dimY];

    boolean isEmpty(int x, int y) {
        if (board[x][y] == XO.EMPTY) {
            return true;
        } else return false;
    }

    void reset(){
        for (int i = 0; i < dimX; ++i){
            for (int n = 0; n < dimY; ++n){
                board[i][n] = XO.EMPTY;
            }
        }
    };

    void setBoard(int x, int y, XO);

    public XO[][] getBoard();

    public XO won();

    public XO whoIsWinner();

    void changed();

    boolean isPlaying();

}
