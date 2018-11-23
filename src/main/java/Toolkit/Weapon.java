package Toolkit;

public class Weapon {

    private String type;
    private int attackingValue;

    public Weapon(String type, int attackingValue) {
        this.type = type;
        this.attackingValue = attackingValue;
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
}
