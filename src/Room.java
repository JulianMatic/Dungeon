
public class Room {
    private String name, description;
    private boolean locked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.locked = false;

    }

    @Override
    public String toString() {
        return "[DEBUG: RoomName = "+ name +"] "+ description;
    }

}