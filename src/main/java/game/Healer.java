package game;


import enums.HealerType;
import enums.HealingType;
import enums.TreasureType;

import java.util.ArrayList;

public class Healer extends Person {
    private HealerType healerType;
    private HealingType healingType;
    private int health;

    public Healer(String name, HealerType healerType, HealingType healingType) {
        super(name);
        this.healerType = healerType;
        this.healingType = healingType;
        this.health = 0;
    }

    public HealerType getHealerType() {
        return healerType;
    }

    public HealingType getHealingType() {
        return healingType;
    }

    public int getHealthFromEnum(){
        return this.health += healerType.getHealth();
    }

}
