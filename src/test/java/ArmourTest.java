import Toolkit.Armour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmourTest {

    Armour armour;

    @Before
    public void setUp() throws Exception {
        armour = new Armour("Shinny");
    }

    @Test
    public void canGetType() {
        assertEquals("Shinny", armour.getType());
    }
}
