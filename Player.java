/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Jonatan
 */
public class Player {
    public String name;
    public int yPos;
    public int xPos;

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
                } else if (rooms[yPos - 1][xPos].locked) {
                    System.out.println("Det här rummet är låst");
                } else {
                    yPos = yPos - 1;
                }
                break;
            case "w":
                System.out.println("Du valde West");
                if (xPos - 1 < 0) {
                    System.out.println("Du kan inte gå West");
                } else if (rooms[yPos][xPos - 1].locked){
                    System.out.println("Det rummet är låst");
                }else {
                    xPos = xPos - 1;
                }

                break;
            case "s":
                System.out.println("Du valde South");
                if (yPos + 1 > rooms.length - 1) {
                    System.out.println("Du kan inte gå South");
                    } else if (rooms[yPos + 1][xPos].locked){
                    System.out.println("Dörren är låst");
                } else {
                    yPos = yPos + 1;
                }
                break;
            case "e":
                System.out.println("Du valde East");
                if (xPos + 1 > rooms[yPos].length - 1) {
                    System.out.println("Du kan inte gå East");
                }else if (rooms[yPos][xPos+1].locked){
                    System.out.println("Dörren är låst");
                } else {
                    xPos = xPos + 1;
                }

                break;
            default:
                System.out.println("Error! Du måste välja rätt");
        }
    }

}
