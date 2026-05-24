package clase;

public class RezervareRestaurant implements Rezervare{
    @Override
    public void rezerva(String nume, int nrPersoane) {
        System.out.println(nume +
                " a realizat rezervare pentru "
                + nrPersoane + " persoane");
    }
}
