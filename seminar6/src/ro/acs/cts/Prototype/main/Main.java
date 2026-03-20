package ro.acs.cts.Prototype.main;

import ro.acs.cts.Prototype.clase.Rezervare;
import ro.acs.cts.Prototype.clase.RezervareAbstract;

public class Main {
    public static void main(String[] args) {
        RezervareAbstract rezervare1=new Rezervare("Annie",20,20,"0740064334");
        RezervareAbstract rezervare2=rezervare1.clone();

        ((Rezervare)rezervare2).setOra(10);
        ((Rezervare)rezervare2).setZiua(10);

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

    }

}
