import enums.CreatureType;
import enums.MagicianType;
import enums.SpellType;
import game.Magician;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicianTest {

    Magician magician;

    @Before
    public void setUp() {
        magician = new Magician("Gandalf", MagicianType.WIZARD, SpellType.THUNDER, CreatureType.UNICORN);

    }
    @Test
    public void hasName() {
        assertEquals ("Gandalf", magician.getName());
    }
    @Test
    public void hasHealthPoints() {
        assertEquals(4, magician.getHealthFromEnum());
    }
    @Test
    public void hasMagicianType() {
        assertEquals(MagicianType.WIZARD, magician.getMagicianType());
    }
    @Test
    public void hasSpellType() {
        assertEquals(SpellType.THUNDER, magician.getSpellType());
    }

    @Test
    public void canChangeSpell() {
        magician.setSpellType(SpellType.FIREBALL);
        assertEquals(SpellType.FIREBALL, magician.getSpellType());
    }
    @Test
    public void hasCreatureType() {
        assertEquals(CreatureType.UNICORN, magician.getCreatureType());
    }
    @Test
    public void canChangeCreature() {
        magician.setCreatureType(CreatureType.DRAGON);
        assertEquals(CreatureType.DRAGON, magician.getCreatureType());
    }
}
