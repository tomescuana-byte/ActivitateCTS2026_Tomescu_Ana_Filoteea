package clase;

public class Plecare implements Command {
    private Autobuz auotbuz;
    private int nrLinie;

    public Plecare(Autobuz auotbuz, int nrLinie) {
        this.auotbuz = auotbuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void pleacaInCursa() {
        auotbuz.pleacaPeTraseu(nrLinie);
    }
}
