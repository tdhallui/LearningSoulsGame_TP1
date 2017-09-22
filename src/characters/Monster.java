package characters;

/**
 * Created by tdhallui on 22/09/17.
 */
public class Monster
{
    private static int INSTANCES_COUNT = 1;

    private String name;
    private int maxLife;
    private int life;
    private int maxStamina;
    private int stamina;

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
    protected void setMaxStamina(int newMaxStamina)
    {
        this.maxStamina = newMaxStamina;
    }
    protected void setStamina(int newStamina)
    {
        this.stamina = newStamina;

    }

    public Monster()
    {
        this.name = "Monster_"+INSTANCES_COUNT;
        INSTANCES_COUNT++;
        this.maxLife = 10;
        this.life = 10;
        this.maxStamina = 10;
        this.stamina = 10;
    }
    public Monster(String newName)
    {
        this.name = newName;
        this.maxLife = 10;
        this.life = 10;
        this.maxStamina = 10;
        this.stamina = 10;
    }

    public boolean isAlive()
    {
        return ((0 < this.life) ? true : false);
    }

    @Override
    public String toString()
    {
        String statut = "ALIVE";
        if (!this.isAlive()) statut = "DEAD";
        return ("[ characters.Monster ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina+"\t("+statut+")");
    }
    public void printStats()
    {
        System.out.println(toString());
    }
}
