package cts.tomescu.ana.g1098.pattern.main;

import cts.tomescu.ana.g1098.pattern.prototype.Autobuz;
import cts.tomescu.ana.g1098.pattern.prototype.AutobuzAbstract;

public class Main {
    public static void main(String[] args) {

        AutobuzAbstract autobuz1=new Autobuz(40,"roz",100);
        AutobuzAbstract autobuz2=autobuz1.clone();

        ((Autobuz)autobuz2).setNr_locuri(300);

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());

    }
}