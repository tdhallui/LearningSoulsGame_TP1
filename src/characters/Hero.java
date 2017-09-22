package characters;

/**
 * Created by tdhallui on 22/09/17.
 */
public class Hero
{
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

    public boolean isAlive()
    {
        return ((0 < this.life) ? true : false);
    }

    public Hero()
    {
        this.name = "Gregooninator";
        this.maxLife = 100;
        this.life = 100;
        this.maxStamina = 50;
        this.stamina = 50;
    }
    public Hero(String newName)
    {
        this.name = newName;
        this.maxLife = 100;
        this.life = 100;
        this.maxStamina = 50;
        this.stamina = 50;
    }

    @Override
    public String toString()
    {
        String statut = "ALIVE";
        if (!this.isAlive()) statut = "DEAD";
        return ("[ characters.Hero ]\t"+this.name+"\tLIFE: "+this.life+"\tSTAMINA: "+this.stamina+"\t("+statut+")");
    }
    public void printStats()
    {
        System.out.println(toString());
    }
}
