package game;

import enums.TreasureType;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private int health;
    private ArrayList<TreasureType> backpack;

    public Person(String name, int health, ArrayList<TreasureType> backpack) {
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

    public ArrayList<TreasureType> getBackpack() {
        return backpack;
    }

}

