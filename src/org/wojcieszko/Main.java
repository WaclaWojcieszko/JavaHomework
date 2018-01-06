package org.wojcieszko;

import org.wojcieszko.lesson.lesson03.Run;

public class Main {

    public static void main(String[] args) {

//        int a = 2;
//        int b = 0;
//
//        b= a==3 ? 5 : 19;
//
//        if (a==3){
//            b=5;
//        }else{
//            b=19;
//        }
//
//    System.out.println(a + " " + b);

//        for (int i = 0; i < 10; ++i) {
////
////            System.out.println("łololo");
////
////        }
////
////        System.out.println(i);

        int[] cosie = new int[10];
//        int[] cosie = {1, 7, 8};
        cosie[1] = 4;
        cosie[3] = 7;

        for (int c : cosie) {
            if (c == 0) {
                continue;
            }
            ++c;
            System.out.println(c);
        }

        System.out.println(cosie[0]);
    }
}