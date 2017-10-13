package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;
import lsg.weapons.ShotGun;
import lsg.weapons.Weapons;

import java.util.Scanner;

/**
 * Created by tdhallui on 22/09/17.
 */
public class LearningSoulsGame
{

    public void fight1v1(Hero oneHero, Monster oneMonster)
    {
        Scanner scanner =  new Scanner(System.in);
        Weapons w = new ShotGun();
        oneHero.setWeapon(w);
        while (oneHero.isAlive() && oneMonster.isAlive())
        {
            System.out.println(oneMonster.toString());
            System.out.println("Monster got hit !");
            oneMonster.getHitWith((int)oneHero.attack());
            System.out.println(oneMonster.toString());
            if (oneMonster.isAlive())
            {
                System.out.println(oneHero.toString());
                System.out.println("Hero got hit !");
                oneHero.getHitWith((int)oneMonster.attack());
                System.out.println(oneHero.toString());
            }
            System.out.print("\nPress enter\n");
            scanner.next();
        }
    }

    public static void main(String[] args)
    {
        LearningSoulsGame thatGame = new LearningSoulsGame();
        Hero h1 = new Hero("hero2kaliteySuperieure");
        Monster m1 = new Monster("Studentatort");

        thatGame.fight1v1(h1, m1);
    }
}
