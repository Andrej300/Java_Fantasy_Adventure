package game;

import enums.WarriorType;
import enums.WeaponType;


public class Warrior extends Person {
    private WarriorType warriorType;
    private WeaponType weaponType;
    private int health;

    public Warrior(String name, WarriorType warriorType, WeaponType weaponType) {
        super(name);
        this.warriorType = warriorType;
        this.weaponType = weaponType;
        this.health = 0;
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

    public int getHealthFromEnum() {
       return this.health += warriorType.getHealth();
    }

}


