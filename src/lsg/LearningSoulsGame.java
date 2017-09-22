package lsg;

import characters.Hero;
import characters.Monster;

/**
 * Created by tdhallui on 22/09/17.
 */
public class LearningSoulsGame
{

    public static void main(String[] args)
    {
        Hero moi = new Hero();
        Monster sdt_a_tor = new Monster("Studentatort");
        Monster m1 = new Monster();
        Monster m2 = new Monster();

        moi.printStats();
        sdt_a_tor.printStats();
        m1.printStats();
        m2.printStats();
    }
}
