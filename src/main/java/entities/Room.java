package entities;

public enum Room {
    Classroom1("First floor"),Classroom2("First floor"),Classroom3("First floor"),
    Classroom4("First floor"),Classroom5("First floor"),Classroom6("First floor"),
    ADMINISTRATION("Ground floor"),LABORATORY("Second floor"),PROFESSOR_ROOM("Second floor"),
    DINNING("Third floor");

    private final String room;

    Room (String room){
        this.room = room;
    }

    public String getRoom() {
        return room;
    }
}
