package ro.acs.cts.FactoryMethod.fabrici;

import ro.acs.cts.FactoryMethod.enums.Tip_mancare;
import ro.acs.cts.FactoryMethod.clase.FelMancare;

public interface FabricaAbstracta {

    public FelMancare getFelMancare(Tip_mancare tipMancare,float pret,float gramaj);
    public FelMancare getFelMancare(Tip_mancare tipMancare,float pret,float gramaj,int calorii);


}
