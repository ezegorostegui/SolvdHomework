package entities;

import enums.Room;

public final class Chef extends Worker  {

    public Chef(String name, String surname, Integer salary, Integer antiquity, String workingSchedule, Room workplace, boolean hasUniform) {
        super(name, surname, salary, antiquity, workingSchedule, workplace);
    }
}
