package org.wojcieszko.homework.homework02;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Roger", "Odrzutowiec", 90123098765L);
        Student student = new Student("Prażonej Kukurydzy i Administracji", 102201, 3);
        Employee employee = new Employee(1200.00);
        Man koloMan = new Man(person, student, employee, null);




        System.out.println();

    }
}
