package object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern;

public class Marcher implements Deplacement {
    @Override
    public void deplacer() {
        System.out.println("marcher");
    }
}
