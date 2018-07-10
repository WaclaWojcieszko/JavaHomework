package org.wojcieszko.homework.homework08;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SecondValueTest {


    @Before
    public void setUp() throws Exception {

    }

    int table[] = {1, 2, 54, 2, 4, 6, 8, 4, 2, 1, 4, 6, 6, 7, 2, 9};
    SecondValue secondValue = new SecondValue(table);

    @Test
    public void least() {

        System.out.println(Arrays.toString(secondValue.getTable()));
        System.out.println(secondValue.leastValue());
    }
}