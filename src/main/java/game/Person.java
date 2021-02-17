package game;

public abstract class Person {
    private String name;
    private int health;
    private ArrayList<Treasure> backpack;

    public Person(String name, int health, ArrayList<Treasure> backpack) {
        this.name = name;
        this.health = health;
        this.backpack = backpack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Treasure> getBackpack() {
        return backpack;
    }

}

