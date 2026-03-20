package main;

import classes.Supa;
import factories.Bucatarie;
import factories.Tipuri;

public class Main {
    public static void main(String[] args) {
    Bucatarie bucatarie=new Bucatarie();
    Supa supa_vita=bucatarie.getSupa(Tipuri.VITA,20,300);
    Supa supa_legume=bucatarie.getSupa(Tipuri.LEGUME,40,400);

    supa_vita.afiseaza_descriere();
    supa_legume.afiseaza_descriere();
    }
}