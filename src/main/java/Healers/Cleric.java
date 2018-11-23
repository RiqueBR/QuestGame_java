package Healers;

import Behaviours.IPlay;

public class Cleric implements IPlay {
    private String name;
    private String healingTool;
    private int healthPoints;

    public Cleric(String name, String healingTool, int healthPoints) {
        this.name = name;
        this.healingTool = healingTool;
        this.healthPoints = healthPoints;

    }

    public String getName() {
        return name;
    }

    public String getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(String healingTool) {
        this.healingTool = healingTool;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
