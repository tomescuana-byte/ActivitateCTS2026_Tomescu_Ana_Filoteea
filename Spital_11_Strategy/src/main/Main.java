package main;

import clase.Card;
import clase.Cash;
import clase.Pacient;

public class Main{
    static void main(String[] args) {
        Pacient pacient=new Pacient("Ana");
        pacient.plata();

        pacient.setModPlata(new Cash());
        pacient.plata();
        
        pacient.setModPlata(new Card());
        pacient.plata();

    }
}