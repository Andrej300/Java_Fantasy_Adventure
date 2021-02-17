package game;

import actions.IPerformAction;
import enums.CreatureType;
import enums.MagicianType;
import enums.SpellType;
import enums.TreasureType;

import java.util.ArrayList;

public class Magician extends Person {
    private MagicianType magicianType;
    private SpellType spellType;
    private CreatureType creatureType;
    private int health;

    public Magician(String name, MagicianType magicianType, SpellType spellType, CreatureType creatureType) {
        super(name);
        this.magicianType = magicianType;
        this.spellType = spellType;
        this.creatureType = creatureType;
        this.health = 0;
    }

    public MagicianType getMagicianType() {
        return magicianType;
    }

    public int getHealthFromEnum() {
        return this.health += magicianType.getHealth();
    }

    public int getCurrentHealth(){
        return this.health;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType;
    }

    public int attackStrength() {
        return this.magicianType.getDamage() + this.spellType.getSpellDamage();
    }


}
