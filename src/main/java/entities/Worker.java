package entities;

import enums.Room;

public abstract class Worker extends Person{
    protected Integer salary;
    protected Integer antiquity;
    protected String workingSchedule;
    protected Room workplace;

    public Worker(){}
    public Worker(String name, String surname, Integer salary, Integer antiquity, String workingSchedule, Room workplace) {
        super(name, surname);
        this.salary = salary;
        this.antiquity = antiquity;
        this.workingSchedule = workingSchedule;
        this.workplace = workplace;
    }

    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public Integer getAntiquity() {
        return antiquity;
    }
    public void setAntiquity(Integer antiquity) {
        this.antiquity = antiquity;
    }
    public String getWorkingSchedule() {
        return workingSchedule;
    }
    public void setWorkingSchedule(String workingSchedule) {
        this.workingSchedule = workingSchedule;
    }
    public Room getWorkplace() {
        return workplace;
    }
    public void setWorkplace(Room workplace) {
        this.workplace = workplace;
    }
}
