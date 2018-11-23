package Mages;

import Behaviours.IDamage;
import Behaviours.IPlay;
import Toolkit.Creature;
import Toolkit.Spell;

public abstract class Mage {

    private String name;
    private int healthValue;
    private Creature creature;
    private Spell spell;

    public Mage(String name, int healthValue, Creature creature, Spell spell) {
        this.name = name;
        this.healthValue = healthValue;
        this.creature = creature;
        this.spell = spell;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
