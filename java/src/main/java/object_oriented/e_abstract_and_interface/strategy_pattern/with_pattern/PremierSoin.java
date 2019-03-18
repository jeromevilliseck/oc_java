package object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern;

public class PremierSoin implements Soin {
    @Override
    public void soigner() {
        System.out.println("premier soins");
    }
}
