package ro.acs.cts.FactoryMethod.fabrici;

import ro.acs.cts.FactoryMethod.enums.Tip_desert;
import ro.acs.cts.FactoryMethod.enums.Tip_mancare;
import ro.acs.cts.FactoryMethod.clase.*;

public class Fabrica_desert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(Tip_mancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare,pret,gramaj,500);
    }

    @Override
    public FelMancare getFelMancare(Tip_mancare tipMancare, float pret, float gramaj, int calorii) {
        if (tipMancare == Tip_desert.CLATITE) {

                return new Clatite(pret, gramaj, calorii);
            }else if (tipMancare == Tip_desert.PAPANASI) {
                return new Papanasi(pret, gramaj, calorii);
            }
            return null;
        }
    }

