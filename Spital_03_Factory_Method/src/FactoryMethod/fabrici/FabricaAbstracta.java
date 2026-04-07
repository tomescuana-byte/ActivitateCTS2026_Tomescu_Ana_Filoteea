package FactoryMethod.fabrici;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.enums.TipPersonal;

public interface FabricaAbstracta {
    public PersonalSpital getPersonalSpital(TipPersonal tipPersonal, String nume,int vechime,double salariu );
    public PersonalSpital getPersonalSpital(TipPersonal tipPersonal, String nume,int vechime);

}
