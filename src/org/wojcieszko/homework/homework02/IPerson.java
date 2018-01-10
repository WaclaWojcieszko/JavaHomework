package org.wojcieszko.homework.homework02;

public interface IPerson {

//    String firstName();
//    String surName();
//    String pesel();

    abstract String getFirstName();
    abstract void setFirstName(String firstName);
    abstract String getSurName();
    abstract void setSurName(String surName);
    abstract Long getPesel();
    abstract void setPesel(String pesel);

}
