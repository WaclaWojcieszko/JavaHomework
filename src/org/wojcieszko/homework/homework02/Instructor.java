package org.wojcieszko.homework.homework02;

public class Instructor implements IInstructor {

    private String title;

    public Instructor(String title) {
        setTitle(title);

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
