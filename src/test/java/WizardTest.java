import Mages.Wizard;
import Toolkit.Creature;
import Toolkit.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Creature creature1;
    Spell spell1;

    @Before
    public void setUp() throws Exception {

        spell1 = new Spell("Fire ball", 50);
        creature1 = new Creature("bob", "Ogre", 30, 50);
        wizard = new Wizard("Wilson Wizard", 150, creature1, spell1);
    }


    @Test
    public void canGetName() {
        assertEquals("Wilson Wizard", wizard.getName());
    }

    @Test
    public void canGetASpell() {
        assertEquals(spell1, wizard.getSpell());
    }

    @Test
    public void canGetACreature() {
        assertEquals(creature1, wizard.getCreature());
    }

    @Test
    public void canSetCreature() {
        Creature creature2 = new Creature("Paul", "Kelpie", 60, 70);
        wizard.setCreature(creature2);
        assertEquals(creature2, wizard.getCreature());
    }
}
