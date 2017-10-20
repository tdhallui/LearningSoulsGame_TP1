package lsg.characters;

/**
 * Created by tdhallui on 19/10/17.
 */
public class Lycanthrope extends Monster
{
    public Lycanthrope()
    {
        super("Lycanthrope");
        super.setSkinThickness(30);
        // super.setWeapon(new Claw()); redondant : tous les monstres sont déjà équipés de Claw à l'heure actuelle
    }
}
