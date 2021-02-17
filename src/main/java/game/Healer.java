package game;


import enums.HealerType;
import enums.HealingType;
import enums.TreasureType;

import java.util.ArrayList;

public class Healer extends Person {
    private HealerType healerType;
    private HealingType healingType;

    public Healer(String name, int health, ArrayList<TreasureType> backpack, HealerType healerType, HealingType healingType) {
        super(name, health, backpack);
        this.healerType = healerType;
        this.healingType = healingType;
    }

    public HealerType getHealerType() {
        return healerType;
    }

    public HealingType getHealingType() {
        return healingType;
    }
}
