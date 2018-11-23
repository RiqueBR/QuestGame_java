import Fighters.Barbarian;
import Toolkit.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian1;
    Barbarian barbarian2;
    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void setUp() throws Exception {
        weapon1 = new Weapon("Sword", 30);
        weapon2 = new Weapon("Axe", 10);
        barbarian1 = new Barbarian("Bob, the barbarian", 100, weapon1);
        barbarian2 = new Barbarian("another barb", 70, weapon2);

    }

    @Test
    public void canGetName() {
        assertEquals("Bob, the barbarian", barbarian1.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(100, barbarian1.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        barbarian1.setHealthPoints(90);
        assertEquals(90, barbarian1.getHealthPoints());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(weapon1, barbarian1.getWeapon());
    }

    @Test
    public void canSetWeapon() {
        barbarian1.setWeapon(weapon2);
        assertEquals(weapon2, barbarian1.getWeapon());
    }

    @Test
    public void canAttack() {
        barbarian1.attack(barbarian2);
        assertEquals(70, barbarian2.getHealthPoints());
    }
}
