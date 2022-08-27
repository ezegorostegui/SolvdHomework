package services;

import entities.Student;
import entities.Subject;
import interfaces.StudentAction;

import javax.swing.*;
import java.util.ArrayList;

public class StudentService implements StudentAction {
    @Override
    public Student createStudent(Student student) {
        int id = 1000;
        String name = (JOptionPane.showInputDialog(null,"Enter name of the student."));
        name = name.toUpperCase();
        student.setName(name);
        String surname = (JOptionPane.showInputDialog(null,"Enter surname of the student."));
        surname = surname.toUpperCase();
        student.setSurname(surname);
        student.setApproveSubject(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of approved subjects of the student.")));
        student.setTotalSubject(Integer.parseInt(JOptionPane.showInputDialog(null,10)));
        id ++;
        student.setId(id);
        return student;
    }

    @Override
    public int chooseStudent(ArrayList<Student> studentList) {
        boolean flag = false;
        int index = 0;
        while(!flag) {
            String name = JOptionPane.showInputDialog(null, "Enter a name to search.");
            name = name.toUpperCase();

            for (Student student : studentList) {
                student.setName(name);
                if(student.getName().equals(studentList.get(index).getName())) {
                    flag = true;
                } else {
                    index++;
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(null, "The student doesn't exist. Try again.");
                index = 0;
            }
        }
        return index;
    }

    @Override
    public void chooseSubject(ArrayList<Student> studentList, int index) {
        boolean flag = true;
        int op;
        if(studentList.get(index).getSubject().size() <= 10) {
            while (flag) {
                studentList.get(index).setSubject(Subject.choose(studentList, index));
                op = JOptionPane.showConfirmDialog(null, "Do you register for another subject?");
                if (op == 1) {
                    flag = false;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,"The student has all subjects approved.");
        }
    }

    @Override
    public void doProcedure(ArrayList<Student> studentList) {
        boolean flag = false;
        int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your id."));
        for (Student student : studentList) {
            if (student.getId() == id) {
                JOptionPane.showMessageDialog(null, student);
                flag = true;
                break;
            }
        }
        if(flag){
            JOptionPane.showMessageDialog(null,"The id doesn't exist.");
        }
    }

    @Override
    public int buyTicket(ArrayList<Student> studentList) {
        boolean flag = false;
        int num = 0;
        int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your id."));
        for (Student student : studentList) {
            if (student.getId() == id) {
                JOptionPane.showMessageDialog(null, "Successful purchase." + "\n" + "\n" +
                        "Name:     " + student.getName() + "\n" +
                        "Surname:  " + student.getSurname() + "\n" + "\n" +
                        "          ------LUNCH TICKET------");
                flag = true;
                num ++;
                break;
            }
        }
        if(flag){
            JOptionPane.showMessageDialog(null,"The id doesn't exist.");
        }
        return num;
    }
}
