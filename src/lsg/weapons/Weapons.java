package lsg.weapons;

/**
 * Created by tdhallui on 12/10/17.
 */
public class Weapons
{
    private String name;
    private int minDamage;
    private int maxDamage;
    private int stamCost;
    private int durability;

    public String getName() { return this.name; }
    public int getMinDamage() { return this.minDamage; }
    public int getMaxDamage() { return this.maxDamage; }
    public int getStamCost() { return this.stamCost; }
    public int getDurability() { return this.durability; }

    private void setDurability(int newNewDurability) { this.durability = newNewDurability; }

    public void use()
    {
        if (1 < this.durability) { this.durability--; }
    }

    public boolean isBroken() {return (0 < this.durability) ? true : false;}

    public Weapons(String newName, int newMinDamage, int newMaxDamage, int newStamCost, int newDurability)
    {
        this.name = newName;
        this.minDamage = newMinDamage;
        this.maxDamage = newMaxDamage;
        this.stamCost = newStamCost;
        this.durability = newDurability;
    }

    @Override
    public String toString()
    {
        String ret = String.format("%-20s (min:%5d max:%5d stam:%5d dur:%5d)", this.name, this.minDamage, this.maxDamage, this.stamCost, this.durability);
        return (ret);
        // BEFORE CHANGING :
        // "[ "+getTypeCharacter()+" ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina+"\t("+statut+")"
    }
}
