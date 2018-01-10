package org.wojcieszko.homework.homework02;

abstract class Man {
    public Man(Person person, Student student, Employee employee, Instructor instructor) {

        Person p = new Person(person);
        Student s = new Student(student);
        Employee e = new Employee(employee);
        Instructor i = new Instructor(instructor);

    }

}