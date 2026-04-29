package decorator;

import clase.NotaDePlataAbstracta;public class NotaDePlataAnulNou extends  NotaDePlataDecorator{

    public NotaDePlataAnulNou(NotaDePlataAbstracta notaDePlata) {
    super(notaDePlata);
}
    @Override
    public void printezaFelicitare() {
    System.out.println("An nou fericit!!!");
    }}
