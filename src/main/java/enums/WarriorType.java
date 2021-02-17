package enums;

public enum WarriorType {

    DWARF(8, 5),
    BARBARIAN(5, 8),
    KNIGHT(7, 7);

    private final int health;
    private final int damage;

    WarriorType(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }
}
