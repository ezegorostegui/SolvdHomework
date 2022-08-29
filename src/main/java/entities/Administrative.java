package entities;

import enums.Room;

public final class Administrative extends Worker{
    private int office;


    public Administrative(String name, String surname, Integer salary, Integer antiquity,
                          String workingSchedule, Room workplace, int office) {
        super(name, surname, salary, antiquity, workingSchedule, workplace);
        this.office = office;
    }

    public int getOffice() {
        return office;
    }
    public void setOffice(int office) {
        this.office = office;
    }
}
