package lsg.characters;

import lsg.weapons.Claw;

/**
 * Created by tdhallui on 22/09/17.
 */
public class Monster extends Character
{
    protected static int NOMBRE_MONSTER = 1;

    public Monster(String newName)
    {
        super(newName);
        NOMBRE_MONSTER++;
        this.maxLife = 10;
        this.life = 10;
        this.maxStamina = 10;
        this.stamina = 10;
        this.typeCharacter = "Monster";
        this.weapon = new Claw();
    }
    public Monster()
    {
        this("Monster_"+NOMBRE_MONSTER);
    }

    @Override
    public String toString()
    {
        String statut = "ALIVE";
        if (!this.isAlive()) statut = "DEAD";
        return ("[ lsg.characters.Monster ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina+"\t("+statut+")");
    }
    public void printStats()
    {
        System.out.println(toString());
    }
}
