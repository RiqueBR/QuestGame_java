package Mages;

import Behaviours.IAttack;
import Behaviours.IDamage;
import Behaviours.IPlay;
import Toolkit.Creature;
import Toolkit.Spell;

public class Wizard extends Mage implements IPlay, IDamage, IAttack {
    public Wizard(String name, int healthValue, Creature creature, Spell spell) {
        super(name, healthValue, creature, spell);
    }


    public void attack(IDamage victim) {

    }

    public void takeDamage(int damage) {

    }
}
