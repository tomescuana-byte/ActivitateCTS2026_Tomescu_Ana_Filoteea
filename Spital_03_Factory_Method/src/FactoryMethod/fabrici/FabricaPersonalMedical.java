package FactoryMethod.fabrici;

import FactoryMethod.clase.Asistent;
import FactoryMethod.clase.Medic;
import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.enums.TipPersonal;
import FactoryMethod.enums.TipPersonalMedical;

public class FabricaPersonalMedical implements FabricaAbstracta{
    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tipPersonal, String nume, int vechime, double salariu) {
        if(tipPersonal== TipPersonalMedical.MEDIC){
            return new Medic(nume,vechime,salariu);
        }
        else if(tipPersonal==TipPersonalMedical.ASISTENT){
            return new Asistent(nume,vechime,salariu);
        }
        return null;
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tipPersonal, String nume, int vechime) {
        return getPersonalSpital(tipPersonal,nume,vechime);
    }
}
