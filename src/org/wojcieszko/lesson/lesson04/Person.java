package org.wojcieszko.lesson.lesson04;

import java.util.Objects;

public class Person implements IPerson {

    private long pesel;
    private String firstName;
    private String surName;

    public Person(String firstName, String surName, long pesel) {
        setPesel(pesel);
        setFirstName(firstName);
        setSurName(surName);

    }

    public Person(){

    }

    public static Person getPerson(){
        Person p = new Person();
        return p;
    }

    public Person validate(){
        if (firstName == null){
            System.out.println("zle");
        }
        return this;
    }

    public long getPesel() {
        return pesel;
    }

    public Person setPesel(long pesel) {
        this.pesel = pesel;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public Person setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel=" + pesel +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return pesel == person.pesel &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pesel, firstName, surName);
    }
}
