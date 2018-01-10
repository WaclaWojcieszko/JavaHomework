package org.wojcieszko.homework.homework02;

public class Main {

    public static void main(String[] args) {

        Person personKoloMan = new Person("Roger", "Odrzutowiec", "90123098765");
        Student studentKoloMan = new Student("Prażonej Kukurydzy i Administracji", 102201, 3);
        Employee employeeKoloMan = new Employee(1200);
        Man koloMan = new Man(personKoloMan, studentKoloMan, employeeKoloMan, null);




        System.out.println(Man.getSurName(koloMan));

    }
}
