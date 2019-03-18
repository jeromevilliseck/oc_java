package object_oriented.e_abstract_and_interface.abstract_class;

public interface Rintintin { //Rintintin est le supertype de Chien, qui est de type animal
    public void faireCalin();
    public void faireLechouille();
    public void faireLeBeau();

    //Objectif créer des instances de chien de type Animal sans implementer des comportements qui ne sont specifiques
    //qu'a chien et qui casseraient la compatibilité avec les autres animaux qui ne pourraient plus etre de type animal
    //Sans devoir implementer obligatoirement ces comportements qui ne les concerne pas
}
