package org.wojcieszko.homework.homework02;

public class Instructor extends Person {

    private String title;

    public Instructor(String pesel, String firstName, String surName) {
        super(pesel, firstName, surName);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
