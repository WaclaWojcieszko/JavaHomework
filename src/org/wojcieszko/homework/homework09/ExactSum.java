package org.wojcieszko.homework.homework09;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExactSum {

    public Integer sum(List<Integer> elements){
        Integer sum = 0;
        for (Integer x : elements) {
            sum += x;
        }
        return sum;
    }


    public void chooser(List<Integer> items, int sum){
        chooserHelper(new ArrayList<>(), items, sum);
    }
    public void chooserHelper(List<Integer> constItems, List<Integer> items, int sum) {

        List<Integer> constItemsCopy = new ArrayList<>(constItems);
        List<Integer> itemsCopy = new ArrayList<>(items);

        if (items.size() == 0) {
            return;
        }


        for (int index = 0; index < itemsCopy.size(); ++index) {


            items = new ArrayList<>(itemsCopy);
            constItems = new ArrayList<>(constItemsCopy);


            if (sum(constItems) == 6) {
                System.out.println(constItems.toString());
                return;
            }

            constItems.add(items.get(index));
            items.remove(index);

            chooserHelper(constItems, items, sum);
        }


    }



    @Test
    public void permChooserTest() {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 3, 3, 5));
        int sum = 6;
        chooser(items, sum);
    }
}
