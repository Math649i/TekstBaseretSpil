public class Enemy {
    private String name;
    private int health;
    private int strength;

    public Enemy(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
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

    // Metode til at tage skade
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    // Tjekker om fjenden er død
    public boolean isDead() {
        return health == 0;
    }
}
