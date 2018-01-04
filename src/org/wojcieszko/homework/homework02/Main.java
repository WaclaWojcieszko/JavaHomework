package org.wojcieszko.homework.homework02;

import org.wojcieszko.homework.homework02.Person;
import org.wojcieszko.homework.homework02.Student;
import org.wojcieszko.homework.homework02.Employee;
import org.wojcieszko.homework.homework02.Instructor;


public class Main {

    public static void main(String[] args) {
        Person kolo = new Person();
        kolo.setFirstName("Roger");
        kolo.setSurName("Odrzutowiec");
        kolo.setPesel("90123098765");

        String x = kolo.getSurName();

        System.out.println(x);

    }
}
