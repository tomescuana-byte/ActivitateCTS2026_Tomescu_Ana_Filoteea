package FactoryMethod.fabrici;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.clase.Registrator;
import FactoryMethod.clase.Secretar;
import FactoryMethod.enums.TipPersonal;
import FactoryMethod.enums.TipPersonalNMedical;

public class FabricaPersonalNMedical implements FabricaAbstracta{
    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tipPersonal, String nume, int vechime, double salariu) {
        return getPersonalSpital(tipPersonal,nume,vechime,salariu);
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tipPersonal, String nume, int vechime) {
        if(tipPersonal== TipPersonalNMedical.SECRETAR){
            return new Secretar(nume,vechime);
        }
        else if(tipPersonal==TipPersonalNMedical.REGISTRATOR){
            return new Registrator(nume,vechime);
        }
        return null;
    }
}
