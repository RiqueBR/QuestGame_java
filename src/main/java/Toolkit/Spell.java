package Toolkit;

public class Spell {

    private String name;
    private int damageValue;

    public Spell(String name, int damageValue) {
        this.name = name;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
