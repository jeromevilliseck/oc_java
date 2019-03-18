package object_oriented.e_abstract_and_interface.strategy_pattern.without_pattern;

public class Medecin extends Personnage {
    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace à pied.");
    }

    public void combattre() {
        if(this.armes.equals("pistolet"))
            System.out.println("Attaque au pistolet !");
        else
            System.out.println("Vive le scalpel !");
    }

    public void soigner(){
        if(this.sacDeSoin.equals("petit sac"))
            System.out.println("Je peux recoudre des blessures.");
        else
            System.out.println("Je soigne les blessures.");
    }
}
