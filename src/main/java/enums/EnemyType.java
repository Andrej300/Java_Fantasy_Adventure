package enums;

public enum EnemyType {
    ORK(8, 4),
    VAMPIRE(7, 3),
    SKELETON(3, 2),
    DEMENTOR(4, 3);

    private final int health;
    private final int damage;

    EnemyType(int health, int damage){
        this.health = health;
        this.damage = damage;
    }
}
