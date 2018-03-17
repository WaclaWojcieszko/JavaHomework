package org.wojcieszko.lesson.lesson08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lesson {

    public static void main0(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("Ala");
        list.add("ma");
        list.add("kota");

        Iterator<String> it = list.iterator();

//       while (it.hasNext()){
//           String s = it.next();
//           it.remove();
//           list.add("łuchuchuchu");
//       }

        System.out.println(list);
    }

}

