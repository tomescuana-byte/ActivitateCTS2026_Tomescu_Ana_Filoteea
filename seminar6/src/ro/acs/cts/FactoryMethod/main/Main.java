package ro.acs.cts.FactoryMethod.main;

import ro.acs.cts.FactoryMethod.enums.Tip_desert;
import ro.acs.cts.FactoryMethod.enums.Tip_supa;
import ro.acs.cts.FactoryMethod.fabrici.Fabrica_desert;
import ro.acs.cts.FactoryMethod.fabrici.Fabrica_supa;
import ro.acs.cts.FactoryMethod.clase.FelMancare;

public class Main {
    public static void main(String[] args) {
        Fabrica_desert fabrica_desert=new Fabrica_desert();
        Fabrica_supa fabrica_supa=new Fabrica_supa();

        FelMancare supaCiuperci= fabrica_supa.getFelMancare(Tip_supa.CIUPERCI,15.5f,300.0f);
        FelMancare supaLegume= fabrica_supa.getFelMancare(Tip_supa.LEGUME,20.5f,400.0f);


        FelMancare papanasi=fabrica_desert.getFelMancare(Tip_desert.PAPANASI,23,56,300);
        FelMancare clatite=fabrica_desert.getFelMancare(Tip_desert.CLATITE,30,67,400);


        supaCiuperci.afisare();
        supaLegume.afisare();

        papanasi.afisare();
        clatite.afisare();

    }
}