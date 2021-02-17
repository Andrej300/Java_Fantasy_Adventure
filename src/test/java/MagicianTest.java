import game.Magician;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicianTest {

    Magician magician;

    @Before
    public void setUp() {
        magician = new Magician("Gandalf", 8, magicianType.WIZARD, spellType.THUNDER, creatureType.UNICORN);

    }
    @Test
    public void hasName() {
        assertEquals ("Gandalf", magician.getName());
    }
    @Test
    public void hasHealthPoints() {
        assertEquals(8, magician.getHealthPoints());
    }
    @Test
    public void hasMagicianType() {
        assertEquals(magicianType.WIZARD, magician.getMagicianType());
    }
    @Test
    public void hasSpell() {
        assertEquals(spellType.THUNDER, magician.getSpellType());
    }
    @Test
    public void hasCreature() {
        assertEquals(creatureType.UNICORN, magician.getCreatureType());
    }
}
