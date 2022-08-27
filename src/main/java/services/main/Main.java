package services.main;

import entities.Student;
import services.StudentService;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){
        StudentService ser = new StudentService();
        ArrayList<Student> studentList = new ArrayList<>();
        Student student = new Student();
        int index;
        boolean finish = false;
        int op;
        do {
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one of the following options:" + "\n" + "\n" +
                        "1. Register a new student." + "\n" +
                        "2. Register subjects." + "\n" +
                        "3. Book a lunch ticket." + "\n" +
                        "4. Print student information." + "\n" +
                        "5. Exit"));
            } while(op < 0 || op > 5);
            switch (op) {
                case 1:
                    int flag = 0;
                    while (flag == 0) {
                        studentList.add(ser.createStudent(student));
                        System.out.println(studentList);
                        flag = JOptionPane.showConfirmDialog(null, "Do you register another student?");
                    }
                    break;
                case 2:
                    index = ser.chooseStudent(studentList);
                    ser.chooseSubject(studentList, index);
                    break;
                case 3:
                    ser.buyTicket(studentList);
                    break;
                case 4:
                    ser.doProcedure(studentList);
                    break;
                default:
                    finish = true;
                    break;
            }
        } while(!finish);
    }
}
