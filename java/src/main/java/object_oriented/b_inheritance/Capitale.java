package object_oriented.b_inheritance;

import object_oriented.a_first_class.Ville;

public class Capitale extends Ville {
    //attribut supplementaire de la classe fille
    private String monument;

    //Constructeur par défaut
    public Capitale(){
        //Ce mot clé appelle le constructeur de la classe mère
        super();
        monument = "aucun";
    }

    //Constructeur d'initialisation de capitale
    public Capitale(String nom, int hab, String pays, String monument){
        //Appelle le constructeur de la classe mère avec cette signature
        super(nom, hab, pays);
        this.monument = monument;
    }

    //comportement enrichi
    public String decrisToi(){
        String str =  super.decrisToi() + "\n \t ==>>" + this.monument+ " en est un monument";
        System.out.println("Invocation de super.decrisToi()");

        return str;
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    @Override
    public String toString() {
        return "Capitale{" +
                "monument='" + monument + '\'' +
                ", nomVille='" + nomVille + '\'' +
                ", nomPays='" + nomPays + '\'' +
                ", nbreHabitants=" + nbreHabitants +
                ", categorie=" + categorie +
                '}';
    }
}
