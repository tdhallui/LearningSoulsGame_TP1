package lsg.characters;

import lsg.helpers.Dice;
import lsg.weapons.Weapons;

import java.util.Locale;

/**
 * Created by tdhallui on 12/10/17.
 */
abstract public class Character
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
    public Weapons getWeapon() { return this.weapon; }

    public boolean isAlive()
    {
        return ((0 < this.life) ? true : false);
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
        finalDamag += (finalDamag * computeBuff() / 100);
        return (Math.round(finalDamag));
    }

    public long attack()
    {
        return (attackWith(this.weapon));
    }

    abstract protected float computeProtection();
    abstract protected float computeBuff();

    public int getHitWith(int value)
    {
        int new_value = 0;
        int ret = 0;
        if (computeProtection() < 100)
        {
            new_value = Math.round(value - value * computeProtection() / 100);
            if (this.life < new_value)
            {
                ret = this.life;
                this.life = 0;
            }
            else
            {
                ret = new_value;
                this.life -= new_value;
            }
        }
        return (ret);
    }

    public Character(String received_name)
    {
        this.name = received_name;
        this.oneDice = new Dice(101);
    }

    @Override
    public String toString()
    {
        String statut = "ALIVE";
        if (!this.isAlive()) statut = "DEAD";
        String ret = String.format("%-20s %-20s LIFE:%-10s STAMINA:%-10s PROTECTION:%-10s BUFF:%-10s(%s)", "[ "+getTypeCharacter()+" ]", this.name, String.format("%5d", this.life), String.format("%5d", this.stamina), String.format(Locale.US,"%6.2f", this.computeProtection()), String.format(Locale.US,"%6.2f", this.computeBuff()), statut);
        return (ret);
    }

}
