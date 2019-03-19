package object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.personnages;

import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.*;

public abstract class Personnages {
    //Instances de comportement par defaut
    protected EspritCombatif espritCombatif = new Pacifiste(); //Un personnage par defaut non spécialisé ne combat pas
    protected Deplacement deplacement = new Marcher(); //marche
    protected Soin soin = new AucunSoin(); //Ne soigne pas

    //Constructeur par défaut
    public Personnages(){}

    //Constructeur avec paramètres -> Donner des comportements à la construction
    public Personnages(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        this.espritCombatif = espritCombatif;
        this.soin = soin;
        this.deplacement = deplacement;
    }

    //LES 3 COMPORTEMENTS CI-DESSOUS PEUVENT ETRE REDEFINIS A TOUT MOMENT -> Polymorphisme + Liskov
    //Chaque classe qui étendra Personnages pourra être de référence personnage

    //Méthode de déplacement de personnage
    public void seDeplacer(){
        //On utilise les objets de déplacement de façon polymorphe
        deplacement.deplacer();
    }

    // Méthode que les combattants utilisent
    public void combattre(){
        //On utilise les objets de déplacement de façon polymorphe
        espritCombatif.combat();
    }

    //Méthode de soin
    public void soigner(){
        //On utilise les objets de déplacement de façon polymorphe
        soin.soigner();
    }

    //SETTERS SUR LES COMPORTEMENTS INTERNES, DE REFERENCE INTERFACE

    //Redéfinit le comportement au combat
    public void setEspritCombatif(EspritCombatif espritCombatif) {
        this.espritCombatif = espritCombatif;
    }

    //Redéfinit le comportement de Soin
    public void setSoin(Soin soin) {
        this.soin = soin;
    }

    //Redéfinit le comportement de déplacement
    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }
}
