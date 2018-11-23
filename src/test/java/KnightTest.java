import Fighters.Knight;
import Toolkit.Armour;
import Toolkit.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight1;
    Knight knight2;
    Weapon weapon1;
    Weapon weapon2;
    Armour armour;

    @Before
    public void setUp() throws Exception {
        armour = new Armour("Shinny");
        weapon1 = new Weapon("Sword", 40);
        weapon2 = new Weapon("Axe", 30);

        knight1 = new Knight("Kevin, the knight", 120, weapon1, armour);
        knight2 = new Knight("Kevin, the knight", 120, weapon1, armour);
    }

    @Test
    public void canGetName() {
        assertEquals("Kevin, the knight", knight1.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(120, knight1.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        knight1.setHealthPoints(90);
        assertEquals(90, knight1.getHealthPoints());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(weapon1, knight1.getWeapon());
    }

    @Test
    public void canSetWeapon() {
        knight1.setWeapon(weapon2);
        assertEquals(weapon2, knight1.getWeapon());
    }

    @Test
    public void canGetArmour() {
        assertEquals(armour, knight1.getArmour());
    }

    @Test
    public void canDefendWithArmour() {
        knight2.defend(50);
  //      knight2.setHealthPoints();
        assertEquals(95, knight2.getHealthPoints());
    }
}
