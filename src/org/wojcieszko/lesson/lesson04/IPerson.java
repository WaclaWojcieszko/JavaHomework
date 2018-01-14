package org.wojcieszko.lesson.lesson04;

public interface IPerson {

    abstract String getFirstName();
    abstract void setFirstName(String firstName);
    abstract String getSurName();
    abstract void setSurName(String surName);
    abstract long getPesel();
    abstract void setPesel(long pesel);

}
