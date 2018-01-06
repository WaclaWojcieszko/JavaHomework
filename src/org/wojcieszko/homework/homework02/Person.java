package org.wojcieszko.homework.homework02;

public class Person implements iPerson {

    private Long pesel;
    private String firstName;
    private String surName;

    public Person(String firstName, String surName, Long pesel) {
        setPesel(pesel);
        setFirstName(firstName);
        setSurName(surName);

    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
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
