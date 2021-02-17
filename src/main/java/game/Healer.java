package game;


import actions.IPerformAction;
import enums.HealerType;
import enums.HealingType;
import enums.TreasureType;

import java.util.ArrayList;

public class Healer extends Person implements IPerformAction {
    private HealerType healerType;
    private HealingType healingType;
    private int health;
    private IPerformAction action;

    public Healer(String name, HealerType healerType, HealingType healingType) {
        super(name);
        this.healerType = healerType;
        this.healingType = healingType;
        this.health = 0;
        this.action = action;
    }

    public HealerType getHealerType() {
        return healerType;
    }

    public HealingType getHealingType() {
        return healingType;
    }

    public void setHealingType(HealingType healingType) {
        this.healingType = healingType;
    }

    public int getHealthFromEnum(){
        return this.health += healerType.getHealth();
    }

    public int getHealStrength(){
        return this.healerType.getHeal() + this.healingType.getHealing();
    }

    public int performAction(IPerformAction action){
       return target.getHealthFromEnum() - performer.getHealStrength();
    }

}
