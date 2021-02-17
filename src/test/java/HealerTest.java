import enums.HealerType;
import enums.HealingType;
import game.Healer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HealerTest {

    Healer healer;

    @Before
    public void setUp() {
        healer = new Healer("Galadriel", 5, HealerType.CLERIC, HealingType.DANDELLION);
    }

    @Test
    public void hasName(){
        assertEquals("Galadriel", healer.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(5, healer.getHealthPoints());
    }

    @Test
    public void hasHealerType() {
        assertEquals(HealerType.CLERIC, healer.getHealerType());
    }

    @Test
    public void hasHealingType() {
        assertEquals(HealingType.DANDELLION, healer.getHealingType());
    }
}
