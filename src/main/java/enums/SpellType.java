package enums;

public enum SpellType {
    FIREBALL(3),
    THUNDER(4),
    ICE(2),
    WATERFALL(5);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }
}
