package object_oriented.c_uml;

public class ObjetA {
    protected ObjetC obj = new ObjetC(); //Possession : 1 instance. A -> C
    protected ObjetD[] objD = new ObjetD[10]; //Composition. n instances. A <>- D

    public ObjetC getObject(){
        return obj;
    }
}
