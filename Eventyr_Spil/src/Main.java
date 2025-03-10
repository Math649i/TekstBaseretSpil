import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Text Adventure Game!");

        // Opretter spiller
        System.out.print("Enter your character's name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        // Opretter fjende
        Enemy goblin = new Enemy("Goblin", 50, 10);

        // Skaber en simpel verden og mulighed for valg
        boolean gameRunning = true;

        while (gameRunning) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Fight a Goblin");
            System.out.println("2. View inventory");
            System.out.println("3. Exit game");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Battle.startBattle(player, goblin);
                    break;
                case "2":
                    player.getInventory().showItems();
                    break;
                case "3":
                    System.out.println("Exiting game...");
                    gameRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (player.isDead()) {
                System.out.println("Game over. You have been defeated.");
                gameRunning = false;
            }
        }
    }
}
