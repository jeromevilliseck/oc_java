package object_oriented.e_abstract_and_interface.strategy_pattern.without_pattern;

public class Guerrier extends Personnage {
    @Override
    public void seDeplacer() {
        System.out.println("Fusil, pistolet, couteau ! Tout ce que tu veux !");
    }

    @Override
    public void combattre() {
        if(this.armes.equals("pistolet"))
            System.out.println("Attaque au pistolet !");
        else if(this.armes.equals("fusil de sniper"))
            System.out.println("Attaque au fusil de sniper !");
        else
            System.out.println("Attaque au couteau !");
    }
}
