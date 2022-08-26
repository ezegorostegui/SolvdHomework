package interfaces;

import entities.Student;

import java.util.ArrayList;

public interface AdministrativeAction {
    //crear arraylist
    ArrayList<Student> students(); //añadir alumnos al sistema
    //crear map para enviar al profesor, recibe arraylist anterior
    void printStudent(Student student);
}
