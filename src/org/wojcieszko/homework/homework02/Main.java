package org.wojcieszko.homework.homework02;

public class Main {

    public static void main(String[] args) {
        Person koloPerson = new iPerson();
        koloPerson.setFirstName("Roger");
        koloPerson.setSurName("Odrzutowiec");
        koloPerson.setPesel("90123098765");



        System.out.println(koloPerson.getSurName());

    }
}
