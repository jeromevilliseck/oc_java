package object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.personnages;

import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.Deplacement;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.EspritCombatif;
import object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern.Soin;

public class Civils extends Personnages {
    public Civils() {}

    public Civils(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}
