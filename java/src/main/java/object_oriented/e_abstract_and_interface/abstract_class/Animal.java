package object_oriented.e_abstract_and_interface.abstract_class;

public abstract class Animal {
    protected int poids;
    protected String couleur;

    public void manger(){
        System.out.println("Animal mange");
    } //Comportement commun a tous les animaux
    public void boire(){
        System.out.println("animal boit");
    }
    public abstract void deplacement(); //Comportement indefinissable pour un animal
    public abstract void crier();

    @Override
    public String toString() {
        return "je suis un Animal{" +
                "poids=" + poids +
                ", couleur='" + couleur + '\'' +
                '}' +
                " classe -> " + this.getClass();
    }
}
