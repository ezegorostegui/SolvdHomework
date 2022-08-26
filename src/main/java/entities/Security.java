package entities;

import java.util.Date;

public final class Security extends Worker{
    private boolean hasUniform;

    public Security(String name, String surname, Integer salary, Integer antiquity,
                    boolean workingSchedule, Room workplace, boolean hasUniform) {
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
