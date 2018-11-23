import Behaviours.IPlay;
import Enemies.Enemy;
import Fighters.Dwarf;
import Fighters.Knight;
import Rooms.Dungeon;
import Rooms.Room;
import Toolkit.Armour;
import Toolkit.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Room dungeon;
    Enemy enemy;
    ArrayList<IPlay> residents;


    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("Edward, the Terrible", 80, 120);
        dungeon = new Dungeon("Fun Dungeon", "gold", enemy, residents);
    }

    @Test
    public void canGetDungeon() {
        assertEquals("Fun Dungeon", dungeon.getName());
    }

    @Test
    public void canGetRoomCount() {
        assertEquals(0, dungeon.roomCount());
    }

    @Test
    public void canGetSomeResidents() {
        Weapon weapon1 = new Weapon("Axe", 30);
        Dwarf dwarf = new Dwarf("Doug, the Dwarf", 80, weapon1);

        Weapon weapon = new Weapon("Sword", 10);
        Armour armour = new Armour("Shinny");
        Knight knight = new Knight("Kevin the Knight", 20, weapon, armour);


        dungeon.addPlayers(knight);
        dungeon.addPlayers(dwarf);

        assertEquals(2, dungeon.roomCount());
    }
}
