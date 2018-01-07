package org.wojcieszko.homework.homework02;

public class Student extends Person {

    private String institute;
    private int term;

    public Student(String pesel, String firstName, String surName) {
        super(pesel, firstName, surName);
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
