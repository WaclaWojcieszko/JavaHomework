package org.wojcieszko.lesson.lesson04;

class Man implements IPerson {

    private Person person;
    private Student student;
    private Employee employee;
    private Instructor instructor;

    public Man(Person person, Student student, Employee employee, Instructor instructor) {

        this.person = person;
        this.student = student;
        this.employee = employee;
        this.instructor = instructor;


    }

    @Override
    public String getFirstName() {
        return person.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public String getSurName() {
        return person.getSurName();
    }

    @Override
    public void setSurName(String surName) {

    }

    @Override
    public long getPesel() {
        return person.getPesel();
    }

    @Override
    public void setPesel(long pesel) {

    }
}