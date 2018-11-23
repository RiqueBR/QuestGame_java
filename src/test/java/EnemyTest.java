import Enemies.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("Ogre", 80, 100);
    }

    @Test
    public void canGetAttackingValue() {
        assertEquals(80, enemy.getAttackingValue());
    }
}
