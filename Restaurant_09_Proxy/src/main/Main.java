package main;

import clase.ProxyRezervare;
import clase.Rezervare;
import clase.RezervareRestaurant;

public class Main{
    static void main(String[] args) {
        Rezervare rezervare =new ProxyRezervare(new RezervareRestaurant());
        rezervare.rezerva("Ana", 2);
        rezervare.rezerva("Maria", 5);

    }
}