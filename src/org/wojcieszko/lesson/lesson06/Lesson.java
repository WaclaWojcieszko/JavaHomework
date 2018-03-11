package org.wojcieszko.lesson.lesson06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson {

    static class Thing<T extends Comparable> {
        T max(T a, T b) {
            return a.compareTo(b) > 0 ? a : b;
        }
    }

    static class Thing1<T, P> {
        void pri(T a, P b) {
            System.out.println(a);
            System.out.println(b);
        }
    }

    static <T extends Comparable> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    public static void main0(String[] args) throws IOException {


        Thing<Integer> thing = new Thing<>();
        Thing1<Integer, String> thing1 = new Thing1<Integer, String>();

        Integer b = Lesson.<Integer>min(123, 135);

        System.out.println(b);


        File file = new File("D:\\data.txt");
        File newFile = new File("D:\\newData.txt");


        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String s;
            int i = 0;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println("Linia " + (++i) + ": " + s);
            }

        }

        try (
                FileWriter fileWriter = new FileWriter(newFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            String string = "taDa!";
            bufferedWriter.write(string);

        }

    }

    public static void main1(String[] args) throws IOException {


        String[] words = "ala ma asa".split(" ");
        for (String word : words) {
            System.out.println("[" + word + "]");
        }
    }

    public static void main(String[] args) throws IOException {

        //Set<Integer> jest funkjonalny (interfejs)
        //new HashSet<>() jest niefunkcjonalne (implementacja)

        Set<Integer> set1 = new HashSet<>(); //nie dba o kolejność i jest szybki - można je wyjąć w innej kolejności niż się wsadziło
        Set<Integer> set2 = new TreeSet<>(); //kolejność w zbiorze jest zachowana

    }

}

