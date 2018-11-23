package Fighters;

import Behaviours.IPlay;
import Toolkit.Weapon;

public class Dwarf extends Fighter implements IPlay {



    public Dwarf(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
    }

}
