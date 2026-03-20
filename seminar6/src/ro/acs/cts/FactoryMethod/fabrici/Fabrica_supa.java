package ro.acs.cts.FactoryMethod.fabrici;

import ro.acs.cts.FactoryMethod.enums.Tip_mancare;
import ro.acs.cts.FactoryMethod.enums.Tip_supa;
import ro.acs.cts.FactoryMethod.clase.FelMancare;
import ro.acs.cts.FactoryMethod.clase.SupaCiuperci;
import ro.acs.cts.FactoryMethod.clase.SupaLegume;

public class Fabrica_supa implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(Tip_mancare tipMancare, float pret, float gramaj) {
        if (tipMancare == Tip_supa.LEGUME)
        {
            return new SupaLegume(pret,gramaj);
        }else if(tipMancare == Tip_supa.CIUPERCI){
            return new SupaCiuperci(pret,gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(Tip_mancare tipMancare, float pret, float gramaj, int calorii) {
        return getFelMancare(tipMancare, pret,gramaj);
    }
}
