package object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.personnages;

import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.CombatPistolet;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.Deplacement;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.EspritCombatif;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.Soin;

public class Guerriers extends Personnages {
    public Guerriers() {
        this.espritCombatif = new CombatPistolet(); //En cas de construction standard par defaut affectation de l'implementation pistolet pour l'interface de combat du personnage
    }

    public Guerriers(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        super(espritCombatif, soin, deplacement);
    }
}
