package main;

import clase.NotaDePlata;
import clase.NotaDePlataAbstracta;
import decorator.NotaDePlata1Mai;
import decorator.NotaDePlataAnulNou;
import decorator.NotaDePlataDecorator;

public class Main {
    static void main(String[] args) {
        NotaDePlataAbstracta notaDePlata = new NotaDePlata(200, "31 decembrie 2029");
        notaDePlata.printeaza();
        NotaDePlataDecorator notaDePlataDecorator;

        int a = 2;
        if (a == 1) {
            notaDePlataDecorator = new NotaDePlataAnulNou(notaDePlata);
        }
        else {
         notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
    }
        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printezaFelicitare();







    }

}