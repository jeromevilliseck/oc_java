package object_oriented.e_abstract_and_interface.strategy_pattern.with_pattern;

public class AucunSoin implements Soin {
    @Override
    public void soigner() {
        System.out.println("aucun soin");
    }
}
