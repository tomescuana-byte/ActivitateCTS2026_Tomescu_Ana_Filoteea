package main;

import clase.*;

public class Main{
    static void main(String[] args) {
        MijlocDeTransport autobuz1=new Autobuz(23,100);
        MijlocDeTransport autobuz2=new Autobuz(0,331);

        Statie statieRomana=new Statie("Piata Romana",20);
        Statie statieUniversitate=new Statie("Universitate",0);

        autobuz1.opresteInStatie(statieRomana);
        autobuz2.opresteInStatie(statieUniversitate);

        System.out.println("=======================");


        MijlocDeTransport autobuzNoapte103=new AutobuzNoapte(autobuz1);
        MijlocDeTransport autobuzNoapte108=new AutobuzNoapte(autobuz2);

        autobuzNoapte103.opresteInStatie(statieRomana);
        autobuzNoapte108.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuz=new Autobuz(12,6, TipCursa.SPECIALA);
        MijlocDeTransport autoSpeical=new AutobuzCursaSpeciala(autobuz);

        MijlocDeTransport autobuzSpecial100=new AutobuzCursaSpeciala(autobuz);
        autobuzSpecial100.opresteInStatie(statieRomana);



    }
}