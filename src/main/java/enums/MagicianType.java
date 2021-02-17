package enums;

public enum MagicianType {
    WARLOCK(6, 4),
    WIZARD(4, 6);

    private final int health;
    private final int damage;

    MagicianType(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }

}
