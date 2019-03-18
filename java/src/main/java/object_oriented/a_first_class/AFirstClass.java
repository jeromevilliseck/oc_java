package object_oriented.a_first_class;

//Il n'est pas necessaire de faire les imports de classe situés dans le même package

public class AFirstClass {
    public AFirstClass() {
        //Coloration de la sortie terminal
        System.out.print("\u001B[31m");

        //Constructeur standard sans param
        Ville v = new Ville();

        //Constructeur avec param
        Ville v1 = new Ville("Marseille", 123456, "France");
        Ville v2 = new Ville("Rio", 321654, "Brésil");

        //affichage des attributs des objets via leurs accesseurs (getters)
        System.out.println("\n v = " + v.getNom() + " ville de  " + v.getNombreHabitants() +
                " habitants se situant en " + v.getNomPays());
        System.out.println(" v1 = " + v1.getNom() + " ville de  " + v1.getNombreHabitants() +
                " habitants se situant en " + v1.getNomPays());
        System.out.println(" v2 = " + v2.getNom() + " ville de  " + v2.getNombreHabitants() +
                " habitants se situant en " + v2.getNomPays() + "\n\n");

        /*
        Nous allons interchanger les Villes v1 et v2
        tout ça par l'intermédiaire d'un autre objet Ville.
        */

        Ville temp = new Ville();
        temp = v1;
        v1 = v2;
        v2 = temp;

        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

        /*
          Nous allons maintenant interchanger leurs noms
          cette fois par le biais de leurs mutateurs.
        */
        v1.setNom("Hong Kong");
        v2.setNom("Djibouti");

        System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

        v.comparer(v2); //IMPORTANT le this dans la méthode comparer s'applique sur l'appelant, ici v

        //Statisme
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

        System.out.println();
    }
}
