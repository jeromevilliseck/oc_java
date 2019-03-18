package object_oriented.e_abstract_and_interface.strategy_pattern.without_pattern;

public class Sniper extends Personnage {
    public void combattre() {
        if(this.armes.equals("fusil à pompe"))
            System.out.println("Attaque au fusil à pompe !");
        else
            System.out.println("Je me sers de mon fusil à lunette !");
    }
}
