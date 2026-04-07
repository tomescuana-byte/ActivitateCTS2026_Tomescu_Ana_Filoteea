package factories;

import classes.Asistent;
import classes.Brancardier;
import classes.Medic;
import classes.PersonalSpital;

public class Spital {
    public PersonalSpital getPersonalSpital(Tipuri tip,String nume,int vechime){
        if(tip==Tipuri.ASISTENT){
            return new Asistent(nume,vechime);
        }
        if(tip==Tipuri.BRANCARDIER){
            return new Brancardier(nume,vechime);
        }
        if(tip==Tipuri.MEDIC){
            return new Medic(nume,vechime);
        }
        return null;
    }
}
