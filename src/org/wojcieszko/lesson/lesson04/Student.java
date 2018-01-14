package org.wojcieszko.lesson.lesson04;

public class Student implements IStudent {

    private String institute;
    private int studentId;
    private int term;

    public Student(String institute, int studentId, int term) {
        setInstitute(institute);
        setStudentId(studentId);
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
