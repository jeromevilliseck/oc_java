package objectOriented.aFirstClass;

public class Ville {
    //Variables d'instances

    private String nomVille; //nom de la ville
    private String nomPays; //nom du pays
    private int nbreHabitants; //nombre d'habitants de la ville
    private char categorie; //categorie de la ville fonction du nombre d'habitants

    //Variables de classe, communes et identiques à toutes les instances

    public static int nbreInstances = 0; //Compte le nombre d'instances
    private static int nbreInstancesBis = 0; //Compte le nombre d'instances de manière privée

    public Ville() {
        //On incrémente nos variables à chaque appel aux constructeurs
        nbreInstances++;
        nbreInstancesBis++;
        //Le reste ne change pas.

        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitants = 0;
        this.setCategorie(); //affectation interne d'un caractéristique de l'instance selon
        // les valeurs de ses autres attributs
    }

    //Constructeur avec paramètres
    //J'ai ajouté un « p » en première lettre des paramètres.
    //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
    public Ville(String pNom, int pNbre, String pPays)
    {
        //On incrémente nos variables à chaque appel aux constructeurs
        nbreInstances++;
        nbreInstancesBis++;
        //Le reste ne change pas.

        System.out.println("Création d'une ville avec des paramètres !");
        nomVille = pNom;
        nomPays = pPays;
        nbreHabitants = pNbre;
        this.setCategorie();
    }

    //ACCESSEURS
    //Retourne le nom de la ville
    public String getNom()  {
        return nomVille;
    }

    //Retourne le nom du pays
    public String getNomPays()
    {
        return nomPays;
    }

    // Retourne le nombre d'habitants
    public int getNombreHabitants()
    {
        return nbreHabitants;
    }

    public static int getNombreInstancesBis()
    {
        return nbreInstancesBis;
    }

    //MUTATEURS

    //Définit le nom de la ville
    public void setNom(String pNom)
    {
        nomVille = pNom;
    }

    //Définit le nom du pays
    public void setNomPays(String pPays)
    {
        nomPays = pPays;
    }

    //Définit le nombre d'habitants
    public void setNombreHabitants(int nbre)
    {
        nbreHabitants = nbre;
        this.setCategorie(); //On met un jour automatiquement la catégorie si on redefinit le nb d'habitants
    }

    //Définit la catégorie de la ville
    //Methode privée, à travers un getter
    private void setCategorie() {

        int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        int i = 0;
        //bornes supérieures.length = 8 elements
        //nb d'habitants superieurs à la borne superieure de la categorie
        while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
            i++;

        this.categorie = categories[i];
    }

    //Retourne la description de la ville directement sans passer par les accesseurs (en interne)
    public String decrisToi(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "
                +this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
    }

    //Retourne une chaîne de caractères selon le résultat de la comparaison
    public String comparer(Ville v1){
        String str = new String();

        if (v1.getNombreHabitants() > this.nbreHabitants)
            str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;

        else
            str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();

        return str;
    }
}


