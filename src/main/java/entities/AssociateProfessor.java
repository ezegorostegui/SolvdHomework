package entities;

import enums.Room;
import enums.Subject;
import interfaces.ProfessorAction;

import java.util.ArrayList;

public final class AssociateProfessor extends Professor {

    public AssociateProfessor(){}

    @Override
    public String toString() {
        return "AssociateProfessor{" +
                "studentList=" + studentList +
                ", subject=" + subject +
                ", salary=" + salary +
                ", antiquity=" + antiquity +
                ", workingSchedule='" + workingSchedule + '\'' +
                ", workplace=" + workplace +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
