import Mages.Warlock;
import Toolkit.Creature;
import Toolkit.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Creature creature1;
    Spell spell1;

    @Before
    public void setUp() throws Exception {
        spell1 = new Spell("Fire ball", 50);
        creature1 = new Creature("bob", "Ogre", 30, 50);
        warlock = new Warlock("Wilson Warlock", 80, creature1, spell1);
    }

    @Test
    public void canGetName() {
        assertEquals("Wilson Warlock", warlock.getName());
    }

    @Test
    public void canGetASpell() {
        assertEquals(spell1, warlock.getSpell());
    }

    @Test
    public void canGetACreature() {
        assertEquals(creature1, warlock.getCreature());
    }

    @Test
    public void canSetCreature() {
      Creature creature2 = new Creature("Paul", "Kelpie", 60, 70);
        warlock.setCreature(creature2);
        assertEquals(creature2, warlock.getCreature());
    }
}
