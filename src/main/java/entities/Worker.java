package entities;

import enums.Room;

public abstract class Worker extends Person{
    protected Integer salary;
    protected Integer antiquity;
    protected boolean workingSchedule;
    protected Room workplace;

    public Worker(String name, String surname, Integer salary, Integer antiquity, boolean workingSchedule, Room workplace) {
        super(name, surname);
        this.salary = salary;
        this.antiquity = antiquity;
        this.workingSchedule = workingSchedule;
        this.workplace = workplace;
    }
}
