package clase;

public class ProxyRezervare implements  Rezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String nume, int nrPersoane) {
        if(nrPersoane>=4){
            rezervare.rezerva(nume, nrPersoane);
        }
        else{
            System.out.println("nu se poate realiza rezervarea!");
        }
    }
}
