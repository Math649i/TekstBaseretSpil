public class Battle {

    public static void startBattle(Player player, Enemy enemy) {
        System.out.println("A battle has started!");
        System.out.println("You are fighting " + enemy.getName());

        while (!player.isDead() && !enemy.isDead()) {
            // Spilleren angriber
            System.out.println("You attack " + enemy.getName() + "!");
            enemy.takeDamage(player.getStrength());
            if (enemy.isDead()) {
                System.out.println(enemy.getName() + " has been defeated!");
                break;
            }

            // Fjenden angriber
            System.out.println(enemy.getName() + " attacks you!");
            player.takeDamage(enemy.getStrength());
            if (player.isDead()) {
                System.out.println("You have been defeated...");
            }
        }
    }
}
