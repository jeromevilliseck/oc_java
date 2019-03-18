package object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern;

public class CombatPistolet implements EspritCombatif {
    @Override
    public void combat() {
        System.out.println("combat au pistolet");
    }
}
