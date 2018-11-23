package Mages;

import Behaviours.IAttack;
import Behaviours.IDamage;
import Behaviours.IPlay;
import Toolkit.Creature;
import Toolkit.Spell;

public class Warlock extends Mage implements IPlay, IDamage, IAttack {

    public Warlock(String name, int healthValue, Creature creature, Spell spell) {
        super(name, healthValue, creature, spell);
    }

    public void attack(IDamage victim) {

    }

    public void takeDamage(int damage) {

    }
}
