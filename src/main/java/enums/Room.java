package enums;

import java.util.Objects;

public enum Room {
    Classroom1("First floor"), Classroom2("First floor"), Classroom3("First floor"),
    Classroom4("First floor"), Classroom5("First floor"), Classroom6("First floor"),
    ADMINISTRATION("Ground floor"), LABORATORY("Second floor"), PROFESSOR_ROOM("Second floor"),
    DINNING("Third floor");

    private final String room;

    Room(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public static Room chooseRoom() {
        switch (Objects.requireNonNull(Subject.choose())) {
            case MATHEMATICS:
                return Classroom1;
            case LOGICAL:
                return Classroom2;
            case REPRESENTATION_SYSTEM:
                return Classroom3;
            case ENGLISH:
                return Classroom4;
            case PHYSICS:
                return LABORATORY;
            case CHEMISTRY:
                return LABORATORY;
            case ARCHITECTURE:
                return Classroom5;
            case MECHANICAL:
                return Classroom6;
            case COMPUTER_SCIENCE:
                return Classroom2;
            case BLOCKCHAIN:
                return Classroom1;
        }
        return null;
    }
}