package interfaces;

import entities.Student;
import exceptions.ProjectExceptions;

import java.util.ArrayList;

public interface StudentAction {
    Student createStudent() throws ProjectExceptions;
    int chooseStudent(ArrayList<Student> studentList);
    void chooseSubject(ArrayList<Student> studentList, int index);
    void doProcedure(ArrayList<Student> studentList);
    int buyTicket(ArrayList<Student> studentList);
}
