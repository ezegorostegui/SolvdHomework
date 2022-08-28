package enums;

import entities.Student;

import javax.swing.*;
import java.util.ArrayList;

public enum Subject {
    MATHEMATICS, LOGICAL, REPRESENTATION_SYSTEM, ENGLISH, PHYSICS,
    CHEMISTRY, ARCHITECTURE, MECHANICAL, COMPUTER_SCIENCE, BLOCKCHAIN;

    Subject() {}

    public static int print(){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Register for a subject:"+"\n"+"\n"+
                "1. MATHEMATICS"+"\n"+
                "2. LOGICAL"+"\n"+
                "3. REPRESENTATION_SYSTEM"+"\n"+
                        "4. ENGLISH"+"\n"+
                        "5. PHYSICS"+"\n"+
                        "6. CHEMISTRY"+"\n"+
                        "7. ARCHITECTURE"+"\n"+
                        "8. MECHANICAL"+"\n"+
                        "9. COMPUTER_SCIENCE"+"\n"+
                        "10. BLOCKCHAIN"));
    }
    public static ArrayList<Subject> choose(ArrayList<Student> studentList, int index){
        ArrayList<Subject> aux = studentList.get(index).getSubject();
        int op = print();
        switch (op){
            case 1:

                aux.add(MATHEMATICS);
                break;
            case 2:
                aux.add(LOGICAL);
                break;
            case 3:
                aux.add(REPRESENTATION_SYSTEM);
                break;
            case 4:
                aux.add(ENGLISH);
                break;
            case 5:
                aux.add(PHYSICS);
                break;
            case 6:
                aux.add(CHEMISTRY);
                break;
            case 7:
                aux.add(ARCHITECTURE);
                break;
            case 8:
                aux.add(MECHANICAL);
                break;
            case 9:
                aux.add(COMPUTER_SCIENCE);
                break;
            case 10:
                aux.add(BLOCKCHAIN);
                break;
        }
        return aux;
    }
    public static Subject choose(){
        int op = print();
        switch (op){
            case 1:
                return MATHEMATICS;
            case 2:
                return LOGICAL;
            case 3:
                return REPRESENTATION_SYSTEM;
            case 4:
                return ENGLISH;
            case 5:
                return PHYSICS;
            case 6:
                return CHEMISTRY;
            case 7:
                return ARCHITECTURE;
            case 8:
                return MECHANICAL;
            case 9:
                return COMPUTER_SCIENCE;
            case 10:
                return BLOCKCHAIN;
        }
        return null;
    }
}
