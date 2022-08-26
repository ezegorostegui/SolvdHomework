package entities;

import interfaces.ChefAction;

import java.util.Date;

public final class Chef extends Worker  {
    private boolean hasUniform;

    public Chef(String name, String surname, Integer salary, Integer antiquity, boolean workingSchedule, Room workplace, boolean hasUniform) {
        super(name, surname, salary, antiquity, workingSchedule, workplace);
        this.hasUniform = hasUniform;
    }

    public boolean isHasUniform() {
        return hasUniform;
    }
    public void setHasUniform(boolean hasUniform) {
        this.hasUniform = hasUniform;
    }
}
