package cts.Tomescu.Ana.g1098.simpleFactory.main;

import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.Bautura;
import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.factories.Bucatarie;
import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.factories.Tipuri;

public class Main {
    public static void main(String[] args) {
        Bucatarie bucatarie=new Bucatarie();
        Bautura cafea1=bucatarie.getBautura(Tipuri.CAFEA,"flat white",230,34.5);
        Bautura ceai1=bucatarie.getBautura(Tipuri.CEAI,"musetel",200,15);
        Bautura ciocolata1=bucatarie.getBautura(Tipuri.CIOCOLATA,"ciocolata neagra",250,30);
        Bautura ciocolata2=bucatarie.getBautura(Tipuri.CIOCOLATA,"ciocolata alba",250,35);

        cafea1.metodaPreparare();
        ceai1.metodaPreparare();
        ciocolata1.metodaPreparare();
        ciocolata2.metodaPreparare();

    }
}