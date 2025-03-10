import java.util.Scanner;

public class GameUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Text Adventure Game!");

        // Opretter spiller
        System.out.print("Enter your character's name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        // Opretter fjende
        Enemy goblin = new Enemy("Goblin", 50, 10);

        // Start kamp
        Battle.startBattle(player, goblin);
    }
}
