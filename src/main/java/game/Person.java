package game;

import enums.TreasureType;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private ArrayList<TreasureType> backpack;

    public Person(String name) {
        this.name = name;
        this.backpack = new ArrayList<>();

    }

    public String getName() {
        return name;
    }


    public ArrayList<TreasureType> getBackpack() {
        return backpack;
    }

}

