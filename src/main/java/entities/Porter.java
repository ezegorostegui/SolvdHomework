package entities;

import java.util.Date;

public final class Porter extends Worker {
    private boolean hasMaterials;

    public Porter(String name, String surname, Integer salary, Integer antiquity,
                  boolean workingSchedule, Room workplace, boolean hasMaterials) {
        super(name, surname, salary, antiquity, workingSchedule, workplace);
        this.hasMaterials = hasMaterials;
    }

    public boolean isHasMaterials() {
        return hasMaterials;
    }
    public void setHasMaterials(boolean hasMaterials) {
        this.hasMaterials = hasMaterials;
    }
}
