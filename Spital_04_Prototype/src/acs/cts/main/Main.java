package acs.cts.main;

import acs.cts.prototype.Reteta;
import acs.cts.prototype.RetetaAbstract;

public class Main {
    public static void main(String[] args) {
        RetetaAbstract reteta1= new Reteta("Paracetamol",40,200.7);
        RetetaAbstract reteta2=reteta1.clone();

        ((Reteta)reteta2).setCantitate(400);

        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());
    }
}