package entities;

import java.util.ArrayList;

public final class Student extends Person {
    private ArrayList<Subject> subject = new ArrayList<>();
    private Room classRoom;
    private int totalSubject;
    private int approveSubject;
    private int id;

    public Student(String name, String surname, ArrayList<Subject> subject, Room classRoom, int totalSubject, int approveSubject, int id) {
        super(name, surname);
        this.subject = subject;
        this.classRoom = classRoom;
        this.totalSubject = totalSubject;
        this.approveSubject = approveSubject;
        this.id = id;
    }
    public Student(){}

    public ArrayList<Subject> getSubject() {
        return subject;
    }
    public void setSubject(ArrayList<Subject> subject) {
        this.subject = subject;
    }

    public Room getClassRoom() {
        return classRoom;
    }
    public void setClassRoom(Room classRoom) {
        this.classRoom = classRoom;
    }

    public int getTotalSubject() {
        return totalSubject;
    }
    public void setTotalSubject(int totalSubject) {
        this.totalSubject = totalSubject;
    }

    public int getApproveSubject() {
        return approveSubject;
    }
    public void setApproveSubject(int approveSubject) {
        this.approveSubject = approveSubject;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
