package object_oriented.e_abstract_and_interface.abstract_class;

public class Chat extends Felin {

    //Ne pas oublier le constructeur dans le dernier niveau d'heritage, on peut faire this sur les
    //attributs de la classe mere
    public Chat(String couleur) {
        this.couleur = couleur;
        this.poids = poids;
    }



    public void crier() {
        System.out.println("Chat crie");
    }
}
