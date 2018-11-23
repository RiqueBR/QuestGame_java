package Rooms;

import Enemies.Enemy;

import java.util.ArrayList;

public class Dungeon extends Room {
    public Dungeon(String name, String treasure, Enemy enemy, ArrayList players) {
        super(name, treasure, enemy, players);
    }
}
