package decorator;

import clase.NotaDePlataAbstracta;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstracta notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printezaFelicitare() {
        System.out.println("La multi ani de 1 MAI!!!");
    }
}
