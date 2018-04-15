package org.wojcieszko.ticTacToe.model;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.Arrays;
import java.util.Observable;

public class Board extends Observable {


    private final int dim;
    private TicTac[][] data;

    public int getDim() {
        return dim;
    }

    public Board() {
        this.dim = 3;
        this.data = new TicTac[getDim()][getDim()];
        reset();
    }

    public void reset() {
        for (TicTac[] row : data) {
            Arrays.fill(row, TicTac.EMPTY);
            setChanged();
            notifyObservers();
        }

    }

    public TicTac getData(int x, int y) {
        return data[x][y];
    }

    public TicTac[][] getData() {
        return data;
    }

    public void setData(int x, int y, TicTac value) {
        this.data[x][y] = value;
        setChanged();
        notifyObservers();

    }

    public boolean ifFreeSpace() {
        for (int x = 0; x < data.length; ++x) {
            for (int y = 0; y < data.length; ++y) {
                if (data[x][y] == TicTac.EMPTY) {
                    return true;
                }
            }
        }

        return false;
    }


}
