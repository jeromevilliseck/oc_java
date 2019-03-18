package object_oriented.e_abstract_and_interface.abstract_class;

public class Chien extends Canin implements Rintintin{ //Toujours extends avant implements
    public Chien() {
    }

    public Chien(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public void crier() {
        System.out.println("chien crie");
    }

    public void faireCalin() {
        System.out.println("Je te fais un GROS CÂLIN");
    }

    public void faireLeBeau() {
        System.out.println("Je fais le beau !");
    }

    public void faireLechouille() {
        System.out.println("Je fais de grosses léchouilles...");
    }
}
