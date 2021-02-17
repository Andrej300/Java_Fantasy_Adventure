import enums.WarriorType;
import enums.WeaponType;
import game.Warrior;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    
    @Before
    public void setUp(){
        warrior = new Warrior("Gimli", WarriorType.DWARF, WeaponType.AXE);
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



    }

