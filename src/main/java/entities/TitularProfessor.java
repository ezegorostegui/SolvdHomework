package entities;

import enums.Room;
import enums.Subject;

import java.util.ArrayList;
import java.util.HashSet;

public final class TitularProfessor extends Professor{

    public TitularProfessor(){}
    public TitularProfessor(String name, String surname, Integer salary, Integer antiquity,
                            String workingSchedule, Room workplace, HashSet<Student> student, Subject subject) {
        super(name, surname, salary, antiquity, workingSchedule, workplace, student, subject);
    }

    @Override
    public String toString() {
        return "TitularProfessor{" +
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
