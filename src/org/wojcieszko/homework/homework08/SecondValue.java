package org.wojcieszko.homework.homework08;

public class SecondValue {
    public static void main(String[] args) {


        int[] table1 = {1, 2, 3, 4};
        int[] table2 = {1, 3, 2, 3};
        int[] value = new int[2];


        for (int t : table2) {
            if (t >= value[1]) {
                value[0] = value[1];
                value[1] = t;
            }
        }


        System.out.println(value[0]);

    }

}
