package object_oriented.e_abstract_and_interface.abstract_class;

public abstract class Canin extends Animal {
    public void deplacement() {
        System.out.println("canin se deplace");
    } //Comportement commun a tout les canins

    //abstract void crier(); //Comportement encore plus spécifique à chaque type de canin

    //On peut s'affranchir de mettre crier dans la classe mais on perd en lisibilité
    //IMPORTANT la classe abstraite n'est pas obligé de contenir des methodes abstraites,
    // elle est juste non instanciable


}
