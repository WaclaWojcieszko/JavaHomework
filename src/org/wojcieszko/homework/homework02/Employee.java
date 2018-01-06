package org.wojcieszko.homework.homework02;

public class Employee extends Person {

    private Double salary;

    public Employee(String pesel, String firstName, String surName) {
        super(pesel, firstName, surName);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
