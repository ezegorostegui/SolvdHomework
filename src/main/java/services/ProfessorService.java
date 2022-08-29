package services;

import entities.AssociateProfessor;
import entities.Professor;
import entities.Student;
import entities.TitularProfessor;
import enums.Room;
import enums.Subject;
import exceptions.ProjectExceptions;
import interfaces.ProfessorAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.util.LinkedList;

public class ProfessorService implements ProfessorAction {
    private static final Logger LOG = LogManager.getLogger(ProfessorService.class);
    @Override
    public Professor createProfessor() throws ProjectExceptions {
        int op, antiquity, salary;
        String name, surname, time;

        TitularProfessor tp = new TitularProfessor();
        AssociateProfessor ap = new AssociateProfessor();
        try {
            name = JOptionPane.showInputDialog(null, "Enter professor's name.");
            name = name.toUpperCase();
            surname = JOptionPane.showInputDialog(null, "Enter professor's surname.");
            surname = surname.toUpperCase();
            salary = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter salary"));
            antiquity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter antiquity"));
            do {
                time = JOptionPane.showInputDialog(null, "Does worker work at morning or at afternoon");
                time = time.toUpperCase();
            } while (time.equals("MORNING") || time.equals("AFTERNOON"));
            do {
                op = JOptionPane.showConfirmDialog(null, "Choose an option:" + "\n" + "\n" +
                        "1. Titular professor." +
                        "2. Associate professor.");
            } while (op != 1 && op != 2);
            if (op == 1) {
                tp.setName(name);
                tp.setSurname(surname);
                tp.setSalary(salary);
                tp.setAntiquity(antiquity);
                tp.setWorkingSchedule(time);
                tp.setSubject(Subject.choose());
                tp.setWorkplace(Room.chooseRoom());
                return tp;
            } else {
                ap.setName(name);
                ap.setSurname(surname);
                ap.setSalary(salary);
                ap.setAntiquity(antiquity);
                ap.setWorkingSchedule(time);
                ap.setSubject(Subject.choose());
                ap.setWorkplace(Room.chooseRoom());
                return ap;
            }
        } catch (NumberFormatException s) {
            throw new ProjectExceptions("Invalid data. Enter an integer number");
        }
    }

    @Override
    public LinkedList<Student> assignStudent() throws ProjectExceptions {
        try{



        } catch(NullPointerException s){
            throw new ProjectExceptions("No pointer assigned on the list");
        }
        return null;
    }

    @Override
    public void assignTitularProfessor() {

    }

    @Override
    public void evaluateStudent() {
        //Create a map whit idStudent as key and finalNote as value.
    }

    @Override
    public int buyTicketP(Professor tp, Professor ap) {

        return 0;
    }
}
