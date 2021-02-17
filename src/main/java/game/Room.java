package game;

import enums.EnemyType;
import enums.TreasureType;

public class Room {
    private String name;
    private TreasureType treasureType;
    private EnemyType enemyType;

    public Room(String name, TreasureType treasureType, EnemyType enemyType) {
        this.name = name;
        this.treasureType = treasureType;
        this.enemyType = enemyType;
    }

    public String getName() {
        return name;
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }
}
