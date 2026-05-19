package clase;

public class Ocupare implements Command{
   private Masa masa;
   private int nrPersoane;

    public Ocupare(Masa masa, int nrPersoane) {
        this.masa = masa;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void executa() {
        masa.ocupa(nrPersoane);
    }
}
