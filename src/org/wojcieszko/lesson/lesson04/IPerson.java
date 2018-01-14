package org.wojcieszko.lesson.lesson04;

public interface IPerson {

    abstract String getFirstName();
    abstract Person setFirstName(String firstName);
    abstract String getSurName();
    abstract Person setSurName(String surName);
    abstract long getPesel();
    abstract Person setPesel(long pesel);

}
