package main;

import clase.Autobuz;
import clase.Calator;
import clase.CalatorAbonat;
import clase.MijlocTransport;

public class Main{
    static void main(String[] args) {
        Calator calator=new CalatorAbonat("Andrei");
        Calator calator1=new CalatorAbonat("Iosif");
        Calator calator2=new CalatorAbonat("Ioana");
        Calator calator3=new CalatorAbonat("Marcel");


        MijlocTransport autobuz=new Autobuz("10");
        autobuz.abonareCalator(calator);
        autobuz.abonareCalator(calator1);
        autobuz.abonareCalator(calator2);
        autobuz.abonareCalator(calator3);

        autobuz.pleacaDinDepou();
        autobuz.abonareCalator(calator3);
        autobuz.ramaneBlocatInTrafic();

    }
}