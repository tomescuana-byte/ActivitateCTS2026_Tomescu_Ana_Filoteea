package ro.acs.cts.main;

import ro.acs.cts.builder01.AbstractBuilder;
import ro.acs.cts.builder01.Rezervare;
import ro.acs.cts.builder01.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new RezervareBuilder();
        Rezervare rezervare3=builder.build("Annie");
        Rezervare rezervare4=builder.build("Dennie");
        rezervare3.setDecorareMasa(true);
        System.out.println(rezervare3.toString());
        System.out.println(rezervare4.toString());



    }
}