package enums;

public enum CreatureType {

    DRAGON(10),
    OGRE(8),
    UNICORN(6),
    FAIRY(4);

    private final int health;

    CreatureType(int health){
        this.health = health;

    }

}
