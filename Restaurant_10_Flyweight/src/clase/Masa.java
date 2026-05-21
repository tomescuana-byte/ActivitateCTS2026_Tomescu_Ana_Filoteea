package clase;

public class Masa implements Rezervare{
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;

    public Masa(int nrMasa, int nrPersoane, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }



    @Override
    public void descriereRezervare(Client client) {
        System.out.println("Rezervare: Masa cu numarul "+this.nrMasa+" are un numar de "+ this.nrPersoane+" persoane rezervate la ora: "+this.oraRezervare+", rezervare facuta de: "+client.toString());
    }
}
