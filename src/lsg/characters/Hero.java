package lsg.characters;

import lsg.weapons.Sword;

/**
 * Created by tdhallui on 22/09/17.
 */
public class Hero extends Character
{
    protected static int NOMBRE_HERO = 1;

    public Hero(String newName)
    {
        super(newName);
        NOMBRE_HERO++;
        this.maxLife = 100;
        this.life = 100;
        this.maxStamina = 50;
        this.stamina = 50;
        this.typeCharacter = "Hero";
        this.weapon = new Sword();
    }
    public Hero()
    {
        this("Gregooninator"+NOMBRE_HERO);
    }


    public void printStats()
    {
        System.out.println(toString());
    }
}
