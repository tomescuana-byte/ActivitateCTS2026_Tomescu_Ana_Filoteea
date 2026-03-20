package factories;

import classes.Supa;
import classes.Supa_ciuperci;
import classes.Supa_legume;
import classes.Supa_vita;

public class Bucatarie {
    public Supa getSupa(Tipuri tip,int calorii, float gramaj){
        if(tip==Tipuri.CIUPERCI){
            return new Supa_ciuperci(calorii,gramaj);
        }
        if(tip==Tipuri.LEGUME){
            return new Supa_legume(calorii,gramaj);
        }
        if(tip==Tipuri.VITA){
            return new Supa_vita(calorii,gramaj);
        }
        return null;
    }
}
