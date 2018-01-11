package org.wojcieszko.homework.homework02;

public class Person implements IPerson {

    private long pesel;
    private String firstName;
    private String surName;

    public Person(String firstName, String surName, long pesel) {
        setPesel(pesel);
        setFirstName(firstName);
        setSurName(surName);

    }


    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
