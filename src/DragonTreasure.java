import java.util.Scanner;

public class DragonTreasure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv ditt användarnamn");
        String playerName = scanner.nextLine();

        Room[][] rooms = {
                {new Room("Rum Sword", ""), new Room("Rum Monster", ""), new Room("Rum Exit", "")},
                {new Room("Rum Start", "När " +playerName+ " går in i grottan kollapsar ingången bakom dig.\nRummet är upplyst av några ljus som sitter på ett bord framför dig.\nDu kan gå norrut [n]\nDu kan gå söderut [s]")},
                {new Room("Rum Key", ""), new Room("Rum Potion", ""), new Room("Rum Dragon", "")}
        };

       rooms[2][2].setLocked(true);

        var player = new Player(playerName, 1, 0);

        System.out.println(player.getCurrentRoomForPlayer(rooms));

        while (true) {
            System.out.println("Navigera: (n,w,s,e)");
            String userInput = scanner.nextLine();
            player.Move(userInput, rooms);
            System.out.println(player.getCurrentRoomForPlayer(rooms));
        }
    }

}

