package object_oriented.e_abstract_and_interface.abstract_class;

public abstract class Felin extends Animal {
    void deplacement() {
        System.out.println("felin se deplace");
    } //Comportement commun à chaque references felin

    abstract void crier(); //Comportement encore plus specifique a felin
    /*IMPORTANT dans une classe de niveau intermediaire qui n'est pas censée etre
    instanciée, toujours reporter les methodes abstraites de sa classe mère pour gagner en
    visibilité de qui n'a pas encore été défini et reste a definir plus bas
     */
}
