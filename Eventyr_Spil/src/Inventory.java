import java.util.ArrayList;

public class Inventory {
    private ArrayList<String> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // Metode til at tilføje et objekt
    public void addItem(String item) {
        items.add(item);
    }

    // Metode til at vise alle objekter
    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.println("Inventory: ");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}
