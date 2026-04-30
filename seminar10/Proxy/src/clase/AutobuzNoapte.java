package clase;

public class AutobuzNoapte implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(statie.getNrCalatori()>0 || this.mijlocDeTransport.getPasageri()>0){
            this.mijlocDeTransport.opresteInStatie(statie);
        }
        else{
            System.out.println("Autobuzul nu opreste in statia: "+statie.getNume());
        }
    }

    @Override
    public int getPasageri() {
        return this.mijlocDeTransport.getPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocDeTransport.getTipCursa();
    }
}
