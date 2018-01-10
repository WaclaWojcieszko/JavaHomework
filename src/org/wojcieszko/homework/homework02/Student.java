package org.wojcieszko.homework.homework02;

public class Student implements IStudent {

    private String institute;
    private int indeks;
    private int term;

    public Student(String institute, int indeks, int term) {
        setInstitute(institute);
        setIndeks(indeks);
        setTerm(term);
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

}
