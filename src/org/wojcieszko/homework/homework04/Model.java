package org.wojcieszko.homework.homework04;

public class Model {
    final int dimX = 3;
    final int dimY = 3;

    public enum XO {
        TIC("X"),
        TAC("O"),
        EMPTY(" ");

        String symbol;

        XO(String symbol){
            this.symbol = symbol;
        }

        public String getSymbol (){
            return symbol;
        }

    }

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
    }

    void setBoard(int x, int y, XO board){

    }

    public XO getBoard() {
        return board[0][0];
    }

    public XO won(){
        return XO.EMPTY;
    }

    public XO whoIsWinner(){
        return XO.EMPTY;
    }

    void changed(){

    }

    public XO isPlaying(){
        return XO.EMPTY;
    }

}
