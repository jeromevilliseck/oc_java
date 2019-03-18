package object_oriented.e_abstract_and_interface.strategy_pattern.without_pattern;

public class Chirurgien extends Personnage {
    public void soigner(){
        if(this.sacDeSoin.equals("gros sac"))
            System.out.println("Je fais des merveilles.");
        else
            System.out.println("Je fais des opérations.");
    }
}
