package clase;

public class Autobuz implements MijlocDeTransport{

    private int pasageri;
    private int nrLinie;
    private TipCursa tipCursa;


    public Autobuz(int pasageri, int nrLinie) {
        this.pasageri = pasageri;
        this.nrLinie = nrLinie;
        this.tipCursa=TipCursa.NORMALA;

    }

    public Autobuz(int pasageri, int nrLinie, TipCursa tipCursa) {
        this.pasageri = pasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    public int getPasageri() {
        return pasageri;
    }

    public TipCursa getTipCursa() {
        return tipCursa;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul de pe linia "+nrLinie+" a oprit in statia: "+statie.getNume());
    }
}
