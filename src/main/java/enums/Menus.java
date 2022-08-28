package enums;

import entities.Student;
import services.ChefService;
import services.StudentService;

import javax.swing.*;
import java.util.ArrayList;

public enum Menus {
    ;

    Menus() {}

    public static void studentMenu(){
        StudentService ser = new StudentService();
        ChefService serChef = new ChefService();
        ArrayList<Student> studentList = new ArrayList<>();
        int index, id = 1000, n = 0, op;
        boolean finish = false;
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
                        studentList.add(ser.createStudent());
                        studentList.get(n).setId(id);
                        id ++;
                        n ++;
                        System.out.println(studentList);
                        flag = JOptionPane.showConfirmDialog(null, "Do you register another student?");
                    }
                    break;
                case 2:
                    index = ser.chooseStudent(studentList);
                    ser.chooseSubject(studentList, index);
                    break;
                case 3:
                    int studentTicket = ser.buyTicket(studentList);
                    // create method to return ticket number to chef.
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
    public static void professorMenu(){

    }
}

