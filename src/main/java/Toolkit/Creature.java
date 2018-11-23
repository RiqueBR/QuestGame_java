package Toolkit;



public class Creature {

    private String name;
    private String type;
    private int damageValue;
    private int healthValue;

    public Creature(String name, String type, int damageValue, int healthValue) {
        this.name = name;
        this.type = type;
        this.damageValue = damageValue;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
