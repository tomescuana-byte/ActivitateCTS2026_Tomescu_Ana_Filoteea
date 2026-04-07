package cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.factories;

import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.Bautura;
import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.Cafea;
import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.Ceai;
import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.Ciocolata;

public class Bucatarie {
    public Bautura getBautura(Tipuri tip, String nume, int volum, double pret){
        if(tip== Tipuri.CEAI){
            return new Ceai(nume,volum,pret);
        }
        if(tip==Tipuri.CAFEA){
            return new Cafea(nume,volum,pret);
        }
        if(tip==Tipuri.CIOCOLATA){
            return new Ciocolata(nume,volum,pret);
        }
        return null;
    }
}
