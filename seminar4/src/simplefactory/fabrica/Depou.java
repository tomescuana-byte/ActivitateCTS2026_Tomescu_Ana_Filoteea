package simplefactory.fabrica;

import simplefactory.classes.Autobuz;
import simplefactory.classes.Mijloc_transport;
import simplefactory.classes.Tramvai;
import simplefactory.classes.Troleibuz;

public class Depou {
    public Mijloc_transport getMijlocTransport(Tipuri tip,int nr_roti, String nr_inmatriculare){
        if(tip==Tipuri.AUTOBUZ){
            return new Autobuz(nr_roti,nr_inmatriculare);
        }
        if(tip==Tipuri.TRAMVAI){
            return new Tramvai(nr_roti,nr_inmatriculare);
        }
        if(tip==Tipuri.TROLEIBUZ){
            return new Troleibuz(nr_roti,nr_inmatriculare);
        }
        return null;
    }
}
