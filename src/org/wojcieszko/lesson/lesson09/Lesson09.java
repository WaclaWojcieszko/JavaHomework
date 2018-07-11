package org.wojcieszko.lesson.lesson09;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson09 {

    public int silnia(int n) {

        if (n != 0) {
            return n * silnia(n - 1);
        } else return 1;
    }


    public void permHelper(List<Integer> constItems, List<Integer> items) {

        List<Integer> constItemsCopy = new ArrayList<>(constItems);
        List<Integer> itemsCopy = new ArrayList<>(items);


        if (items.size() == 0) {
            System.out.println(constItems.toString());
            return;
        }

        for (int index = 0; index < itemsCopy.size(); ++index) {

            items = new ArrayList<>(itemsCopy);
            constItems = new ArrayList<>(constItemsCopy);

            constItems.add(items.get(index));
            items.remove(index);

            permHelper(constItems, items);

        }

    }


    public void perm(List<Integer> items) {
        permHelper(new ArrayList<>(), items);
    }

    public void permHelper2(List<Integer> constItems, List<Integer> items) {


        List<Integer> constItemsCopy = new ArrayList<>(constItems);
        List<Integer> itemsCopy = new ArrayList<>(items);


        if (items.size() == 0) {
            System.out.println(constItems.toString());
            return;
        }

        for (int index = 0; index < itemsCopy.size(); ++index) {


            items = new ArrayList<>(itemsCopy);
            constItems = new ArrayList<>(constItemsCopy);


            if (index > 0 && items.get(index).equals(items.get(index - 1))) {
                continue;
            }

            constItems.add(items.get(index));
            items.remove(index);

            permHelper2(constItems, items);
        }

    }


    public void perm2(List<Integer> items) {
        Collections.sort(items);
        permHelper2(new ArrayList<>(), items);
    }


    @Test
    public void permHelperTest() {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        perm(items);
    }

    @Test
    public void permHelperTest2() {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 3, 5, 3));
        perm2(items);
    }




    @Test
    public void test0() {
        Assert.assertEquals(24, silnia(4));
    }


}



