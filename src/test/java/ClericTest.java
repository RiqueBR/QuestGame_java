import Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric("Cedric, the Cleric", "RevivalPotion", 70);
    }

    @Test
    public void canGetName() {
        assertEquals("Cedric, the Cleric", cleric.getName());
    }
}
