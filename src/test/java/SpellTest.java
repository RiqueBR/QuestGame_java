
import Toolkit.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {


    Spell spell1;
    Spell spell2;

    @Before
    public void setUp() throws Exception {
        spell1 = new Spell("fire ball", 40);
        spell2 = new Spell("whoooosh", 0);
    }


    @Test
    public void canGetName() {
        assertEquals("whoooosh", spell2.getName());
    }
}
