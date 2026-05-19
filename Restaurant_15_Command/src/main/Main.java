package main;

import clase.*;

public class Main{
    public static void main(String[] args) {
        Operator operator=new Operator();
        Command comanda1=new Rezervare(new Masa(24),12);
        Command comanda2=new Ocupare(new Masa(10),4);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Rezervare(new Masa(8),1));
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}