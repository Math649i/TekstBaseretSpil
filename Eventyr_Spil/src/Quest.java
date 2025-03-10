public class Quest {
    private String name;
    private String description;

    public Quest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void showQuest() {
        System.out.println("Quest: " + name);
        System.out.println("Description: " + description);
    }
}
