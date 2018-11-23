package Fighters;

import Behaviours.IAttack;
import Behaviours.IDamage;
import Behaviours.IPlay;
import Toolkit.Armour;
import Toolkit.Weapon;

public abstract class Fighter implements IAttack, IDamage, IPlay{

    private String name;
    private int healthPoints;
    private Weapon weapon;

    public Fighter(String name, int healthPoints, Weapon weapon) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(IDamage victim) {
        victim.takeDamage(this.weapon.getAttackingValue());
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }
}
