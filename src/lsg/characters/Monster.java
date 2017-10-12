package lsg.characters;

/**
 * Created by tdhallui on 22/09/17.
 */
public class Monster extends Character
{
    public Monster()
    {
        super(false, "");
    }
    public Monster(String newName)
    {
        super(false, newName);
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
