package cts.Tomescu.Ana.g1098.Prototype.main;

import cts.Tomescu.Ana.g1098.Prototype.classes.BauturaAbstracta;
import cts.Tomescu.Ana.g1098.Prototype.classes.BauturaPresetata;
import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.factories.Tipuri;

public class Program {
    public static void main(String[] args) {
        BauturaAbstracta bautura1=new BauturaPresetata("caramel machiato",300,20, Tipuri.CAFEA);
        BauturaAbstracta bautura2=bautura1.clone();
        System.out.println(bautura1.toString());
        System.out.println(bautura2.toString());
        BauturaAbstracta bautura3=new BauturaPresetata("ceai de macese",150,15, Tipuri.CEAI);
        BauturaAbstracta bautura4=bautura3.clone();
        ((BauturaPresetata)bautura4).setPret(20);
        System.out.println(bautura3.toString());
        System.out.println(bautura4.toString());

    }
}
