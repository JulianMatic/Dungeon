
public class Room {
    public String namn, beskrivning;
    public boolean locked;

    public Room(String namn, String beskrivning) {
        this.namn = namn;
        this.beskrivning = beskrivning;
        this.locked = false;

    }

    @Override
    public String toString() {
        return "[DEBUG: RoomName = "+namn+"] "+ beskrivning;
    }

}