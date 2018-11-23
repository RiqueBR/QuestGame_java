import Toolkit.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void setUp() throws Exception {
        weapon1 = new Weapon("Axe", 20);
        weapon2 = new Weapon("Sword", 30);
    }

    @Test
    public void canGetType() {
        assertEquals("Axe", weapon1.getType());
    }

}
