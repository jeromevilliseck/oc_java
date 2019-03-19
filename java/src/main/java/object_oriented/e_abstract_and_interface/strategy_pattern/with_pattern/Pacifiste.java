package object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern;

public class Pacifiste implements EspritCombatif {
    @Override
    public void combat() {
        System.out.println("je ne combat pas");
    }
}
