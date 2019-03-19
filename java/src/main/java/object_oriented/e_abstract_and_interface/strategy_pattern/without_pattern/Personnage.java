package object_oriented.e_abstract_and_interface.strategy_pattern.without_pattern;

public abstract class Personnage {
    public String armes = "";
    public String chaussures = "";
    public String sacDeSoin = "";

    public void seDeplacer(){
        System.out.println("Je me déplace à pied.");
    }

    public void combattre(){
        System.out.println("Je ne combats PAS !");
    }

    public void setArmes(String armes) {
        this.armes = armes;
    }

    public void setChaussures(String chaussures) {
        this.chaussures = chaussures;
    }

    public void setSacDeSoin(String sacDeSoin) {
        this.sacDeSoin = sacDeSoin;
    }
}