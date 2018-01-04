package org.wojcieszko.homework.homework02;

public class Person {

    private String pesel;
    private String firstName;
    private String surName;

    public String getPesel(String pesel) {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName(String firstName) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

}
