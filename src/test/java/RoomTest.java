import enums.EnemyType;
import enums.TreasureType;
import game.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void setUp(){
        room = new Room("Cave", TreasureType.GEM, EnemyType.VAMPIRE);
    }

    @Test
    public void hasName() {
        assertEquals("Cave", room.getName());

    }

    @Test
    public void hasTreasureType() {
        assertEquals(TreasureType.GEM, room.getTreasureType());

    }

    @Test
    public void hasEnemyType() {
        assertEquals(EnemyType.VAMPIRE, room.getEnemyType());

    }
}
