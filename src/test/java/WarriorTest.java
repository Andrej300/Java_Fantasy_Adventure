import enums.EnemyType;
import enums.TreasureType;
import enums.WarriorType;
import enums.WeaponType;
import game.Room;
import game.Warrior;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Room room;
    @Before
    public void setUp(){
        warrior = new Warrior("Gimli", WarriorType.DWARF, WeaponType.AXE);
        room = new Room("Cave", TreasureType.GEM, EnemyType.VAMPIRE);
    }

    @Test
    public void hasName() {
        assertEquals("Gimli", warrior.getName());
    }
    @Test public void hasWarriorType()
        {assertEquals(WarriorType.DWARF, warrior.getWarriorType());}

        @Test
        public void hasHealth(){
        assertEquals(8, warrior.getHealthFromEnum());
        }

        @Test public void hasWeaponType()
        {assertEquals(WeaponType.AXE, warrior.getWeaponType());}

        @Test public void canChangeWeapon() {
        warrior.setWeaponType(WeaponType.CLUB);
        assertEquals(WeaponType.CLUB, warrior.getWeaponType());
        }

        @Test public void canCollectTreasure(){
        warrior.getTreasure(room.getTreasureType());
        assertEquals(1, warrior.getNumberOfTreasures());
//
        }
        @Test
        public void hasAttackStrength(){
        assertEquals(11, warrior.attackStrength());
        }



    }

