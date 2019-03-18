package object_oriented.e_abstract_and_interface.abstract_class;

public abstract class Felin extends Animal {
    void deplacement() {
        System.out.println("felin se deplace");
    } //Comportement commun à chaque references felin

    abstract void crier(); //Comportement encore plus specifique a felin
}
