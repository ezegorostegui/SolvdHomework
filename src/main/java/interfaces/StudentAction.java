package interfaces;

import entities.Student;

import java.util.ArrayList;

public interface StudentAction {
    Student createStudent(Student student);
    int chooseStudent(ArrayList<Student> studentList);
    void chooseSubject(ArrayList<Student> studentList, int index);
    Student doProcedure(Student student);
    int buyTicket(ArrayList<Student> studentList);
}
