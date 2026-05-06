import clase.Autobuz;
import clase.Command;
import clase.Operator;
import clase.Plecare;

public class Main{
    static void main(String[] args) {
        Operator opeartor=new Operator();
        Command comanda1=new Plecare(new Autobuz("Mercedes"),223);
        Command comanda2=new Plecare(new Autobuz("Audi"),100);



        opeartor.adaugaComanda(comanda1);
        opeartor.adaugaComanda(comanda2);
        opeartor.adaugaComanda(new Plecare(new Autobuz("Volvo"),101));

        opeartor.executaComanda();
        opeartor.executaComanda();
        opeartor.executaComanda();
        opeartor.executaComanda();

    }
}