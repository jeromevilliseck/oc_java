package object_oriented.b_inheritance;

import object_oriented.a_first_class.Ville;

public class BInheritance {
    public BInheritance() {
        System.out.print("\u001B[32m");

        Capitale cap = new Capitale();
        System.out.println(cap.decrisToi());

        //Polymorphisme

        //Objets ville nuls
        Ville[] tableau = new Ville[6]; //NPE (null pointer exception si appels
        // sur ces objets a ce stade)

        //Définition d'un tableau de noms de villes et un autre de nombres d'habitants
        String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
        int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};

        //Les trois premiers éléments du tableau seront des villes,
        //et le reste, des capitales
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                Ville V = new Ville(tab[i], tab2[i], "france");
                tableau[i] = V; //COVARIANCE = Référence > Classe instanciée
            } else {
                Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
                tableau[i] = C;
            }
        }

        //Il ne nous reste plus qu'à décrire tout notre tableau !
        for (Ville V : tableau) {
            System.out.println(V.decrisToi() + "\n"); //Méthode polymorphe
        }

        System.out.println("utilisation de toString() polymorphe");

        //Il ne nous reste plus qu'à décrire tout notre tableau !
        for(Object obj : tableau){
            System.out.println(obj.toString()+"\n");
        }

        System.out.println(tableau[0].toString());
        //Est équivalent à
        System.out.println(tableau[0]);

        //Transtypage
        for(Object v : tableau){
            System.out.println(((Ville)v).decrisToi()+"\n");
        } //vous transtypez la référence v en Ville;
        //vous appliquez la méthodedecrisToi()à la référence appelante,
        // c'est-à-dire, ici, une référenceObjectchangée enVille.


    }
}
