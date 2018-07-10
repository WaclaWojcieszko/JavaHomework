package org.wojcieszko.homework.homework06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Reader {


    public static void main(String[] args) throws IOException {

        File file = new File("D:\\data.txt");

        Map<String, Integer> wordsMap = new HashMap<>();
        Map<String, Integer> theWords = new HashMap<>();
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String s;


            while ((s = bufferedReader.readLine()) != null) {
                for (int n = 0; n < s.split(" ").length; ++n) {
                    String[] sSplit = s.split(" ");

                    if (!sSplit[n].equals("") && wordsMap.containsKey(sSplit[n])) {
                        int value = wordsMap.get(sSplit[n]);
                        System.out.println(sSplit[n]);
                        wordsMap.replace(sSplit[n], ++value);
                    } else if (!sSplit[n].equals("") && sSplit[n].length() > 4 && !wordsMap.containsKey(sSplit[n])) {
                        wordsMap.put(sSplit[n], 1);
                    }

                }

                Map.Entry<String, Integer> maxEntry = null;

                for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {

                    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                        theWords.clear();
                        maxEntry = entry;
                        theWords.put(entry.getKey(), entry.getValue());


                    } else if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) == 0) {

                        theWords.put(entry.getKey(), entry.getValue());

                    }
                }

            }

            System.out.println(theWords);
        }

    }

}
