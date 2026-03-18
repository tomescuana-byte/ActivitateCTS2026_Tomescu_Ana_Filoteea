package simplefactory.program;

import simplefactory.classes.Mijloc_transport;
import simplefactory.fabrica.Depou;
import simplefactory.fabrica.Tipuri;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Depou depou=new Depou();
        Mijloc_transport autobuz= depou.getMijlocTransport(Tipuri.AUTOBUZ,4,"VL.20.ATO");
        Mijloc_transport tramvai= depou.getMijlocTransport(Tipuri.TRAMVAI,20,"B123BNM");

     autobuz.afiseaza_descriere();
     tramvai.afiseaza_descriere();
    }
}
