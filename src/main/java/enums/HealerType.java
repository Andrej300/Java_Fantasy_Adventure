package enums;

import game.Healer;

public enum HealerType {

    CLERIC(8, -5),
    DOCTOR(6, -4);

        private final int health;
        private final int damage;

        HealerType(int health, int damage) {
            this.health = health;
            this.damage = damage;
        }

            public int getHealth(){
            return this.health;
            }

}
