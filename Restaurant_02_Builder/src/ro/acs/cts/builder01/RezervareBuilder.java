package ro.acs.cts.builder01;

public class RezervareBuilder implements AbstractBuilder{
    private boolean laGeam;
    private boolean scauneE;
    private boolean decorareMasa;
    private boolean genMuzica;

    public RezervareBuilder() {
        this.laGeam = false;
        this.scauneE = false;
        this.decorareMasa = false;
        this.genMuzica = false;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(laGeam,scauneE,decorareMasa,genMuzica,numeClient);
    }

    @Override
    public AbstractBuilder setLaGeam(boolean laGeam) {
        this.laGeam=laGeam;
        return this;
    }

    @Override
    public AbstractBuilder setScauneE(boolean scauneE) {
        this.scauneE=scauneE;
        return this;
    }

    @Override
    public AbstractBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa=decorareMasa;
        return this;
    }

    @Override
    public AbstractBuilder setGenMuzica(boolean genMuzica) {
        this.genMuzica=genMuzica;
        return this;
    }
}
