package lsg.helpers;

import java.util.Random;

/**
 * Created by tdhallui on 12/10/17.
 */
public class Dice
{
    private int max_faces;
    private int seed = 5342;
    private Random rand;

    public int rool()
    {
        return (this.rand.nextInt(this.max_faces));
    }

    public Dice(int nbr_faces)
    {
        this.rand = new Random(this.seed);
        this.max_faces = nbr_faces;
    }
}
