package main;

import clasa.Logger;

public class program {
    public static void main(String[] args) {
        Logger log1=Logger.getInstance();
        Logger log2=Logger.getInstance();

log1.log("Comanda plasata");
log2.log("Rezervare facuta");

        System.out.println(log1 == log2);
    }
}
