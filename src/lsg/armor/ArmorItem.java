package lsg.armor;

/**
 * Created by tdhallui on 19/10/17.
 */
public class ArmorItem
{
    private String name;
    private float armorValue;

    public String getName() { return (this.name); }
    public float getArmorValue() { return (this.armorValue); }

    public ArmorItem(String thatName, float thatArmorValue)
    {
        this.name = thatName;
        this.armorValue = thatArmorValue;
    }

    @Override
    public String toString()
    {
        String ret = getName()+"("+getArmorValue()+")";
        return (ret);
    }
}
