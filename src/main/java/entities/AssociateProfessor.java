package entities;

import enums.Room;
import enums.Subject;

import java.util.ArrayList;

public final class AssociateProfessor extends Professor{
    public AssociateProfessor(String name, String surname, Integer salary, Integer antiquity,
                              boolean workingSchedule, Room workplace, Student student, Subject subject) {
        super(name, surname, salary, antiquity, workingSchedule, workplace, student, subject);
    }

    @Override
    public Professor createProfessor() {
        return null;
    }

    @Override
    public ArrayList<Student> assignStudent() {
        return null;
    }

    @Override
    public void assignTitularProfessor() {

    }

    @Override
    public void evaluateStudent() {

    }

    @Override
    public int buyTicket(Professor professor) {
        return 0;
    }
}
