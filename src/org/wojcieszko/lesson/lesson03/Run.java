package org.wojcieszko.lesson.lesson03;

public class Run {
    public static void Run() {

//        int[] cosie = new int[100];
//        cosie[0] = 5;
//        cosie[1] = 10;
//        cosie[2] = 7;
//        System.out.println(cosie[0]);
//
//        if (cosie[0] == 7) {
//            return "x=7";
//        } else if (cosie[0] == 8) {
//            return "x=8";
//        } else {
//            return "cosie!=7 and cosie!=8";
//        }




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
