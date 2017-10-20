package lsg.characters;

import lsg.armor.ArmorItem;
import lsg.armor.BlackWitchVeil;
import lsg.armor.RingedKnightArmor;
import lsg.buffs.rings.Ring;
import lsg.weapons.Sword;

/**
 * Created by tdhallui on 22/09/17.
 */
public class Hero extends Character
{
    protected static int NOMBRE_HERO = 1;
    private static int MAX_ARMOR_PIECES = 3;
    private static int MAX_RINGS = 2;

    private ArmorItem armor[];
    private Ring rings[];

    public void setArmorItem(ArmorItem oneArmorItem, int slot)
    {
        if (1 <= slot && slot <= MAX_ARMOR_PIECES)
        {
            this.armor[slot - 1] = oneArmorItem;
        }
    }

    public void setRing(Ring oneRing, int slot)
    {
        if (1 <= slot && slot <= MAX_RINGS)
        {
            this.rings[slot - 1] = oneRing;
        }
    }

    public float getTotalArmor()
    {
        float ret = 0;

        for(int i = 0; i < MAX_ARMOR_PIECES; i++)
        {
            if (this.armor[i] != null) { ret += this.armor[i].getArmorValue(); }
        }
        return ret;
    }

    public float getTotalBuff()
    {
        float ret = 0;

        for(int i = 0; i < MAX_RINGS; i++)
        {
            if (this.rings[i] != null) { ret += this.rings[i].computeBuffValue(); }
        }
        return ret;
    }

    public ArmorItem[] getArmorItems()
    {
        int j = 0;
        for (int i = 0; i < MAX_ARMOR_PIECES; i++)
        {
            if (this.armor[i] != null) { j++; }
        }
        if (0 < j)
        {
            ArmorItem[] allArmorItems = new ArmorItem[j];
            j = 0;
            for (int i = 0; i < MAX_ARMOR_PIECES; i++)
            {
                if (this.armor[i] != null)
                {
                    allArmorItems[j] = this.armor[i];
                    j++;
                }
            }
            return (allArmorItems);
        }
        else
        {
            return (null);
        }
    }

    public Ring[] getRings()
    {
        int j = 0;
        for (int i = 0; i < MAX_RINGS; i++)
        {
            if (this.rings[i] != null) { j++; }
        }
        if (0 < j)
        {
            Ring[] allRings = new Ring[j];
            j = 0;
            for (int i = 0; i < MAX_RINGS; i++) {
                if (this.rings[i] != null) {
                    allRings[j] = this.rings[i];
                }
                j++;
            }
            return (allRings);
        }
        else
        {
            return (null);
        }
    }

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
        this.rings = new Ring[MAX_RINGS];
        this.armor = new ArmorItem[MAX_ARMOR_PIECES];
    }
    public Hero()
    {
        this("Gregooninator");
    }

    protected float computeProtection() { return (getTotalArmor()); }
    protected float computeBuff() { return (getTotalBuff()); }

    public String armorToString()
    {
        String ret = "ARMOR ";
        float tot = 0f;
        for (int i = 1; i <= MAX_ARMOR_PIECES; i++)
        {
            if (this.armor[i - 1] != null)
            {
                ret += String.format(" %2d:%-30s", i, this.armor[i - 1].toString());
            }
            else
            {
                ret += String.format(" %2d:%-30s", i, "empty");
            }
        }
        ret += "TOTAL:"+getTotalArmor();
        return ret;
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setArmorItem(new BlackWitchVeil(), 1);
        hero.setArmorItem(new RingedKnightArmor(), 3);
        hero.setWeapon(new Sword());
        System.out.println(hero.armorToString());
    }

    public void printStats()
    {
        System.out.println(toString());
    }
}
