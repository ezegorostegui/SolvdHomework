package entities;

import interfaces.ProfessorAction;

import java.util.Date;

public abstract class Professor extends Worker implements ProfessorAction {
    protected Student student;
    protected Subject subject;

    public Professor(String name, String surname, Integer salary, Integer antiquity, boolean workingSchedule,
                     Room workplace, Student student, Subject subject) {
        super(name, surname, salary, antiquity, workingSchedule, workplace);
        this.student = student;
        this.subject = subject;
    }
}
