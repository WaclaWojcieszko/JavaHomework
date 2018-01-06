package org.wojcieszko.lesson.lesson03;

public class Run {
    public static String Run() {

        int[] cosie = new int[100];
        cosie[0] = 5;
        cosie[1] = 10;
        cosie[2] = 7;
        System.out.println(cosie[0]);

        if (cosie[0] == 7) {
            return "x=7";
        } else if (cosie[0] == 8) {
            return "x=8";
        } else {
            return "cosie!=7 and cosie!=8";
        }

    }

}
