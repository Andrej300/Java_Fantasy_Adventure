package game;

import enums.WarriorType;
import enums.WeaponType;

public class Warrior extends Person {
    private WarriorType warriorType;
    private WeaponType weaponType;

    public Warrior(String name, int health, ArrayList<Treasure> backpack, WarriorType warriorType, WeaponType weaponType) {
        super(name, health, backpack);
        this.warriorType = warriorType;
        this.weaponType = weaponType;
    }

    public WarriorType getWarriorType() {
        return warriorType;
    }


    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}


