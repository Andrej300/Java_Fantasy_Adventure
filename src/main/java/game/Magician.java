package game;

import enums.CreatureType;
import enums.MagicianType;
import enums.SpellType;

public class Magician extends Person {
    private MagicianType magicianType;
    private SpellType spellType;
    private CreatureType creatureType;

    public Magician(String name, int health, ArrayList<Treasure> backpack, MagicianType magicianType, SpellType spellType, CreatureType creatureType) {
        super(name, health, backpack);
        this.magicianType = magicianType;
        this.spellType = spellType;
        this.creatureType = creatureType;
    }

    public MagicianType getMagicianType() {
        return magicianType;
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
}
