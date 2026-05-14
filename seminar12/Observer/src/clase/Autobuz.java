package clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj="AUTOBUZUL DE PE LINIA"+ super.linie+"pleaca din depou!";
        notificareCalator(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj="AUTOBUZUL DE PE LINIA"+ super.linie+"nu mai circula!";
        notificareCalator(mesaj);

    }
}
