package interfaces;

import entities.Professor;
import entities.Student;
import exceptions.ProjectExceptions;

import java.util.LinkedList;

public interface ProfessorAction {
    Professor createProfessor() throws ProjectExceptions;
    LinkedList<Student> assignStudent() throws ProjectExceptions;
    void assignTitularProfessor();
    void evaluateStudent();
    int buyTicketP(Professor tp, Professor ap);
}
