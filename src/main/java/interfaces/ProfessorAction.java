package interfaces;

import entities.Professor;
import entities.Student;

import java.util.ArrayList;

public interface ProfessorAction {
    Professor createProfessor();
    ArrayList<Student> assignStudent();
    void assignTitularProfessor();
    void evaluateStudent();
    int buyTicketP(Professor tp, Professor ap);
}
