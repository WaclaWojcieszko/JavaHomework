package org.wojcieszko.lesson.lesson05;

import org.junit.Test;

public class Lesson {

    @Test
    public void test(){
        Integer x = new Integer(1500);
        Integer y = 1500;
        if (x.equals(y)){
            System.out.println("Yes");
        }
    }
}
