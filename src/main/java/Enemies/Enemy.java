package Enemies;

public class Enemy {
    private String type;
    private int attackingValue;
    private int healthValue;

    public Enemy(String type, int attackingValue, int healthValue) {
        this.type = type;
        this.attackingValue = attackingValue;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackingValue() {
        return attackingValue;
    }

    public void setAttackingValue(int attackingValue) {
        this.attackingValue = attackingValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
