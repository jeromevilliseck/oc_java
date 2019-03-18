package object_oriented.e_abstract_and_interface.abstract_class;

public abstract class Canin extends Animal {
    void deplacement() {
        System.out.println("canin se deplace");
    } //Comportement commun a tout les canins

    abstract void crier(); //Comportement encore plus spécifique à chaque type de canin
}
