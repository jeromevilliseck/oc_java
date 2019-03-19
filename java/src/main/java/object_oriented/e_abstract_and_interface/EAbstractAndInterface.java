package object_oriented.e_abstract_and_interface;

import object_oriented.e_abstract_and_interface.abstract_class.Animal;
import object_oriented.e_abstract_and_interface.abstract_class.Chien;
import object_oriented.e_abstract_and_interface.abstract_class.Rintintin;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.Operation;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.personnages.Civils;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.personnages.Guerriers;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.personnages.Personnages;
import object_oriented.e_abstract_and_interface.strategy_pattern.without_pattern.*;

public class EAbstractAndInterface {

    /*
    Animal ani = new Animal(); //Classe abstraite
    ((Loup)ani).manger(); //Transtypage

    //Référence obj ; type Loup ci dessous. La référence obj pointe vers un emplacement mémoire
    Object obj = new Loup();
    //Loup l = obj; //problème de référence
    Loup l = (Loup)obj; //Prevenez la JVM que la référence que vous passez est de type loup
    */

    public EAbstractAndInterface() {
        System.out.print("\u001B[33m");

        Animal l = new Chien("Gris bleuté", 20);
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());

        //l.faireCalin(); impossible, il faut que le chien soit du supertype qui est son interface pour que ça marche
        Rintintin r = new Chien();
        r.faireCalin();
        r.faireLeBeau();
        r.faireLechouille();

        System.out.println();
        System.out.println();

        System.out.print("\u001B[34m");

        System.out.println("//Exemple utilisation pattern Strategy//");

        System.out.println("//A NE PAS FAIRE - SANS LE DESIGN PATTERN//");


        Personnage[] tPers = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};

        for (Personnage p : tPers) {
            System.out.println("\nInstance de " + p.getClass().getName());
            System.out.println("***************************************");
            p.combattre();
            p.seDeplacer();
            //PROBLEME p.soigner() inutilisable de manière polymorphe
        }

        System.out.print("\u001B[35m");

        Personnage[] tPers2 = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};
        String[] tArmes = {"pistolet", "pistolet", "couteau", "fusil à pompe", "couteau"};

        for (int i = 0; i < tPers2.length; i++) {
            System.out.println("\nInstance de " + tPers2[i].getClass().getName());
            System.out.println("*****************************************");
            tPers2[i].combattre();
            tPers2[i].setArmes(tArmes[i]);
            tPers2[i].combattre();
            tPers2[i].seDeplacer();
            //tPers[i].soigner(); inutilisable en l'état
        }

        System.out.println();
        System.out.println();

        System.out.print("\u001B[36m");

        System.out.println("//A FAIRE - AVEC LE DESIGN PATTERN//");

        Personnages[] tPers3 = {new Guerriers(), new Civils()};

        tPers3[0].setSoin(new Operation()); //reaffectation à la volée d'une autre implementation pour le comportement soin du guerrier

        for(int i = 0; i < tPers3.length; i++){
            System.out.println("\nInstance de " + tPers3[i].getClass().getName());
            System.out.println("*****************************************");
            tPers3[i].combattre();
            tPers3[i].seDeplacer();
            tPers3[i].soigner();
        }

    }
}
