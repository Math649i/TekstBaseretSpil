import java.util.ArrayList;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int intelligence;
    private int defense;
    private Inventory inventory; // Tilføj inventory

    public Player(String name) {
        this.name = name;
        this.health = 100; // Starthelbred
        this.strength = 10; // Styrke
        this.intelligence = 5; // Intelligens
        this.defense = 5; // Forsvar
        this.inventory = new Inventory(); // Opretter et nyt inventar
    }

    // Gettere og settere
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // Metode til at tage skade
    public void takeDamage(int damage) {
        int actualDamage = Math.max(0, damage - defense); // Forsvar mod skade
        health -= actualDamage;
        if (health < 0) health = 0;
    }

    // Tjekker om spilleren er død
    public boolean isDead() {
        return health == 0;
    }

    // Tilføj metoden til at få access til inventory
    public Inventory getInventory() {
        return inventory;
    }
}
