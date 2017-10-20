package lsg.characters;

import lsg.buffs.talismans.Talisman;
import lsg.weapons.Claw;

/**
 * Created by tdhallui on 22/09/17.
 */
public class Monster extends Character
{
    protected static int NOMBRE_MONSTER = 1;

    private float skinThickness;
    private Talisman talisman;

    public float getSkinThickness() { return (this.skinThickness); }
    protected void setSkinThickness(float newSkinThickness) { this.skinThickness = newSkinThickness; }

    public Talisman getTalisman() { return this.talisman; }
    public void setTalisman(Talisman newTal) { this.talisman = newTal; }

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
        this.skinThickness = 20;
        this.talisman = null;
    }
    public Monster()
    {
        this("Monster_"+NOMBRE_MONSTER);
    }

    protected float computeProtection() { return (getSkinThickness()); }
    protected float computeBuff() { return this.talisman.computeBuffValue(); }

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
