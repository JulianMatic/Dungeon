public class Player {
    private String name;
    private int yPos;
    private int xPos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public Player(String name, int startPosY, int startPosX) {

        this.name = name;
        this.yPos = startPosY;
        this.xPos = startPosX;

    }
    public void Move(String movement, Room[][] rooms) {
        switch (movement) {
            case "n":
                System.out.println("Du valde North");
                if (yPos - 1 < 0) {
                    System.out.println("Du kan inte gå norrut");
                } else if (rooms[yPos - 1][xPos].isLocked()) {
                    System.out.println("Det här rummet är låst");
                } else {
                    yPos = yPos - 1;
                }
                break;
            case "w":
                System.out.println("Du valde West");
                if (xPos - 1 < 0) {
                    System.out.println("Du kan inte gå West");
                } else if (rooms[yPos][xPos - 1].isLocked()){
                    System.out.println("Det rummet är låst");
                }else {
                    xPos = xPos - 1;
                }

                break;
            case "s":
                System.out.println("Du valde South");
                if (yPos + 1 > rooms.length - 1) {
                    System.out.println("Du kan inte gå South");
                    } else if (rooms[yPos + 1][xPos].isLocked()){
                    System.out.println("Dörren är låst");
                } else {
                    yPos = yPos + 1;
                }
                break;
            case "e":
                System.out.println("Du valde East");
                if (xPos + 1 > rooms[yPos].length - 1) {
                    System.out.println("Du kan inte gå East");
                }else if (rooms[yPos][xPos+1].isLocked()){
                    System.out.println("Dörren är låst");
                } else {
                    xPos = xPos + 1;
                }

                break;
            default:
                System.out.println("Error! Du måste välja rätt");
        }
    }

    public Room getCurrentRoomForPlayer(Room[][] rooms){
        return rooms[this.getYPos()][this.getXPos()];
    }

}
