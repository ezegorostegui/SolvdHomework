package interfaces;

import entities.Student;

import java.util.ArrayList;

public interface StudentAction {
    Student createStudent();
    int chooseStudent(ArrayList<Student> studentList);
    void chooseSubject(ArrayList<Student> studentList, int index);
    void doProcedure(ArrayList<Student> studentList);
    int buyTicket(ArrayList<Student> studentList);
}
