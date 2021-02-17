package enums;

public enum TreasureType {
    NECKLACE(5),
    COINS(3),
    GEM(6),
    GOLD(7);

    private final int monetaryValue;

    TreasureType(int monetaryValue){
        this.monetaryValue = monetaryValue;
    }
}
