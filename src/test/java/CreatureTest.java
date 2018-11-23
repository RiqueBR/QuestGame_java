import Toolkit.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature creature1;
    Creature creature2;

    @Before
    public void setUp() throws Exception {
        creature1 = new Creature("Steve, the Ogre", "Ogre", 20, 40);
        creature2 = new Creature("Dragon", "Ice Dragon", 40, 70);
    }


    @Test
    public void canGetType() {
        assertEquals("Ogre", creature1.getType());
    }
}
