package Fighters;

import Behaviours.IAttack;
import Behaviours.IDamage;
import Behaviours.IDefend;
import Behaviours.IPlay;
import Toolkit.Armour;
import Toolkit.Weapon;

public class Knight extends Fighter implements IPlay, IDamage, IAttack, IDefend {

    Armour armour;

    public Knight(String name, int healthPoints, Weapon weapon, Armour armour) {
        super(name, healthPoints, weapon);
        this.armour = armour;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public void defend(int damage){
        if(this.armour != null){
            int newDamage = damage / 2;
            super.takeDamage(newDamage);
        }else{
            super.takeDamage(damage);
        }
    }

}
