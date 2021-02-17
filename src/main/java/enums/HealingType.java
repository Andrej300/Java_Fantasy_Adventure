package enums;

public enum HealingType {
    PARACETAMOL(-4),
    DANDELLION(-5),
    HEALSPELL(-6);

    private final int heal;

    HealingType(int heal){
        this.heal = heal;
    }

    public int getHealing() {
        return this.heal;
    }
}
