import Fighters.Dwarf;
import Toolkit.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarveTest {

    Dwarf dwarve;
    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void setUp() throws Exception {

        weapon1 = new Weapon("Hammer", 20);
        weapon2 = new Weapon("Axe", 30);
        dwarve = new Dwarf("Doug, the Dwarf", 80, weapon1);
    }

    @Test
    public void canGetName() {
        assertEquals("Doug, the Dwarf", dwarve.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(80, dwarve.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        dwarve.setHealthPoints(90);
        assertEquals(90, dwarve.getHealthPoints());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(weapon1, dwarve.getWeapon());
    }

    @Test
    public void canSetWeapon() {
        dwarve.setWeapon(weapon2);
        assertEquals(weapon2, dwarve.getWeapon());
    }
}
