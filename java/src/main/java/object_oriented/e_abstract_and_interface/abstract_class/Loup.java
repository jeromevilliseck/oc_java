package object_oriented.e_abstract_and_interface.abstract_class;

public class Loup extends Canin {
    public Loup(String nom, int poids) {
        this.couleur = nom;
        this.poids = poids;
    }

    public void crier() {
        System.out.println("loup crie");
    }
}
