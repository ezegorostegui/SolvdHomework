package entities;

import enums.Room;
import enums.Subject;

import java.util.HashSet;

public abstract class Professor extends Worker {
    protected HashSet<Student> studentList;
    protected Subject subject;

    public Professor(){}
    public Professor(String name, String surname, Integer salary, Integer antiquity, String workingSchedule,
                     Room workplace, HashSet<Student> studentList, Subject subject) {
        super(name, surname, salary, antiquity, workingSchedule, workplace);
        this.studentList = studentList;
        this.subject = subject;
    }

    public HashSet<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(HashSet<Student> studentList) {
        this.studentList = studentList;
    }
    public Subject getSubject() {
        return subject;
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
