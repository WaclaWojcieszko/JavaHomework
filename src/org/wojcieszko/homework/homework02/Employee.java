package org.wojcieszko.homework.homework02;

public class Employee implements IEmployee {

    private Double salary;

    public Employee(Double salary) {
        setSalary(salary);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
