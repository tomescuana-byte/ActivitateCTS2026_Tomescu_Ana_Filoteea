package clase;

public class Rezervare implements Command{
   private Masa masa;
   private int nrRezervare;

    public Rezervare(Masa masa, int nrRezervare) {
        this.masa = masa;
        this.nrRezervare = nrRezervare;
    }

    @Override
    public void executa() {
        masa.rezerva(nrRezervare);

    }
}
