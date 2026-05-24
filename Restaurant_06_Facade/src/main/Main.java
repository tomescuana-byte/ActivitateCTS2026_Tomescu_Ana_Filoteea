package main;

import clase.Masa;
import clase.Ospatar;
import clase.ReceptieRestaurant;

public class Main {

    public static void main(String[] args) {

        Masa masa1 = new Masa(1, true, true, true);
        Masa masa2 = new Masa(2, true, false, true);
        Masa masa3 = new Masa(3, true, true, false);
        Masa masa4 = new Masa(4, false, true, true);

        Ospatar ospatar = new Ospatar();
        ReceptieRestaurant receptie = new ReceptieRestaurant(ospatar);
        receptie.verificaMasa(masa1);
        receptie.verificaMasa(masa2);
        receptie.verificaMasa(masa3);
        receptie.verificaMasa(masa4);
    }
}