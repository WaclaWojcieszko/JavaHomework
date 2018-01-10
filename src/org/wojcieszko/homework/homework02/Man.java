package org.wojcieszko.homework.homework02;

class Man {

    public Person person;
    public Student student;
    public Employee employee;
    public Instructor instructor;

    public Man(Person person, Student student, Employee employee, Instructor instructor) {

//            this.getFirstName() = person.setSurName();

        this.person = person;
        this.student = student;
        this.employee = employee;
        this.instructor = instructor;


//        Student manStudent = new Student(student);
//        Employee manEmployee = new Employee(employee);
//        Instructor manInstructor = new Instructor(instructor);

    }

}