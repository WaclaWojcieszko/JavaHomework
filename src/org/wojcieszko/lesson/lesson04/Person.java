package org.wojcieszko.lesson.lesson04;

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
}
