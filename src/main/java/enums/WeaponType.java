package enums;

public enum WeaponType {
    AXE(6),
    CLUB(4),
    SWORD(5);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getWeaponDamage() {
        return this.damage;
    }
}
