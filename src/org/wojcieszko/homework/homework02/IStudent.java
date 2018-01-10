package org.wojcieszko.homework.homework02;

public interface IStudent {
//    String institute;
//    int indeks;
//    int term;

    abstract String getInstitute();
    abstract void setInstitute(String institute);
    abstract int getTerm();
    abstract void setTerm(int term);
    abstract int getIndeks();
    abstract void setIndeks(int indeks);

}
