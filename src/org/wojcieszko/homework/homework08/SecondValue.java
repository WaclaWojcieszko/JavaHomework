package org.wojcieszko.homework.homework08;

import org.junit.Test;

public class SecondValue {

    private int[] table;

    public int[] getTable() {
        return table;
    }

    public SecondValue(int[] table) {
        this.table = table;
    }

    public int leastValue() {

        int[] value = new int[2];


        for (int t : table) {
            if (t >= value[1]) {
                value[0] = value[1];
                value[1] = t;
            } else if (t >= value[0]) {
                value[0] = t;
            }
        }
        return value[0];
    }
    //pobawić się z więcej elementowymi tablicami
}
