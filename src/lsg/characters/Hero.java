package lsg.characters;

/**
 * Created by tdhallui on 22/09/17.
 */
public class Hero extends Character
{
    public Hero()
    {
        super(true, "");
    }
    public Hero(String newName)
    {
        super(true, newName);
    }


    public void printStats()
    {
        System.out.println(toString());
    }
}
