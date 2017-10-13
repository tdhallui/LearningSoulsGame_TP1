package lsg.characters;

import lsg.helpers.Dice;
import lsg.weapons.Weapons;

/**
 * Created by tdhallui on 12/10/17.
 */
public class Character
{
    protected String name;
    protected int maxLife;
    protected int life;
    protected int maxStamina;
    protected int stamina;
    protected String typeCharacter;

    protected Weapons weapon;
    protected Dice oneDice;

    public String getName()
    {
        return (this.name);
    }
    public int getMaxLife()
    {
        return (this.maxLife);
    }
    public int getLife()
    {
        return (this.life);
    }
    public int getMaxStamina()
    {
        return (this.maxStamina);
    }
    public int getStamina()
    {
        return (this.stamina);
    }
    public String getTypeCharacter()
    {
        return (this.typeCharacter);
    }

    protected void setName(String newName)
    {
        this.name = newName;
    }
    protected void setMaxLife(int newMaxLife)
    {
        this.maxLife = newMaxLife;
    }
    protected void setLife(int newLife)
    {
        this.life = newLife;
    }
    protected void setMaxStamina(int newMaxStamina) { this.maxStamina = newMaxStamina; }
    protected void setStamina(int newStamina)
    {
        this.stamina = newStamina;
    }

    public void setWeapon(Weapons oneWeapon) { this.weapon = oneWeapon; }

    public boolean isAlive()
    {
        return ((0 < this.life) ? true : false);
    }

    @Override
    public String toString()
    {
        String statut = "ALIVE";
        if (!this.isAlive()) statut = "DEAD";
        String ret = String.format("[ %-20s ]\t%-20s\tLIFE: %-10s\tSTAMINA: %-10s\t(%-20s)", getTypeCharacter(), this.name, String.format("%5d", this.life), this.stamina, statut);
        return (ret);
        // BEFORE CHANGING :
        // "[ "+getTypeCharacter()+" ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina+"\t("+statut+")"
    }

    protected long attackWith(Weapons weapon)
    {
        int diffDamag = weapon.getMaxDamage() - weapon.getMinDamage();
        double luckDamag = diffDamag * this.oneDice.rool() / 100;
        double quotStam = this.stamina / weapon.getStamCost();
        double finalDamag;
        if (1 <= quotStam)
        {
            finalDamag = luckDamag;
            this.stamina = this.stamina - weapon.getStamCost();
        }
        else
        {
            finalDamag = luckDamag * quotStam;
            this.stamina = 0;
        }
        return (Math.round(finalDamag));
    }

    public long attack()
    {
        return (attackWith(this.weapon));
    }

    public int getHitWith(int value)
    {
        int ret = (this.life < value) ? this.life : value;
        if (this.life < value)
        {
            ret = this.life;
            this.life = 0;
        }
        else
        {
            ret = value;
            this.life -= value;
        }
        return (ret);
    }

    public Character(String received_name)
    {
        this.name = received_name;
        this.oneDice = new Dice(101);
    }
}
