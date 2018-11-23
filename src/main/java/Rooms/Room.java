package Rooms;

import Behaviours.IPlay;
import Enemies.Enemy;
import Fighters.Fighter;

import java.util.ArrayList;

public abstract class Room implements IPlay{

    private String name;
    private String treasure;
    private Enemy enemy;
    private ArrayList<IPlay> players;

    public Room(String name, String treasure, Enemy enemy, ArrayList players) {
        this.name = name;
        this.treasure = treasure;
        this.enemy = enemy;
        this.players = new ArrayList<IPlay>();
    }

    public String getName() {
        return name;
    }


    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void addPlayers(IPlay player) {
        this.players.add(player);
    }

    public int roomCount() {
        return this.players.size();
    }
}
