package services;

import entities.Student;
import enums.Subject;
import interfaces.StudentAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.util.ArrayList;


public class StudentService implements StudentAction {
    private static final Logger LOG = LogManager.getLogger(StudentService.class);
    @Override
    public Student createStudent(Student student) {

        String name = (JOptionPane.showInputDialog(null,"Enter name of the student."));
        name = name.toUpperCase();
        student.setName(name);
        String surname = (JOptionPane.showInputDialog(null,"Enter surname of the student."));
        surname = surname.toUpperCase();
        student.setSurname(surname);
        student.setApproveSubject(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of approved subjects of the student.")));
        student.setTotalSubject(10);
        return student;
    }

    @Override
    public int chooseStudent(ArrayList<Student> studentList) {
        boolean flag = true;
        int index = 0;
        while(flag) {
            String name = JOptionPane.showInputDialog(null, "Enter a name to search.");
            name = name.toUpperCase();

            for (Student student : studentList) {
                student.setName(name);
                if(student.getName().equals(studentList.get(index).getName())) {
                    flag = false;
                    LOG.info("The student exist.");
                } else {
                    index++;
                }
            }
            if (flag) {
                LOG.info("The student doesn't exist. Try again.");
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
                LOG.info("You are register in:"+"\n"+"\n"+studentList.get(index).getSubject());
            }
        } else {
            LOG.info("The student has all subjects approved.");
        }
    }

    @Override
    public void doProcedure(ArrayList<Student> studentList) {
        boolean flag = false;
        int index = 0;

        do {
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your id."));
            for (Student aux2 : studentList) {
                aux2.setId(id);
                if (aux2.getId() != studentList.get(index).getId()) {
                    index++;
                } else {
                    break;
                }
            }
            if (studentList.get(index).getId() == id) {
                LOG.info("Information about the student:" + "\n" + "\n" + studentList.get(index));

                flag = true;
            } else {
                LOG.info("The id doesn't exist.");
            }
        } while(flag);
    }

    @Override
    public int buyTicket(ArrayList<Student> studentList) {
        int index = 0;
        int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your id."));
        for (Student aux2 : studentList) {
            aux2.setId(id);
            if (aux2.getId() != studentList.get(index).getId()) {
                index++;
            } else {
                break;
            }
        }
        if (studentList.get(index).getId() == id) {
            LOG.info("Successful purchase." + "\n" + "\n" +
                    "Name:     " + studentList.get(index).getName() + "\n" +
                    "Surname:  " + studentList.get(index).getSurname() + "\n" + "\n" +
                    "          ------LUNCH TICKET------");
        } else {
            LOG.info("The id doesn't exist.");
        }
        return studentList.get(index).getId();
    }
}
