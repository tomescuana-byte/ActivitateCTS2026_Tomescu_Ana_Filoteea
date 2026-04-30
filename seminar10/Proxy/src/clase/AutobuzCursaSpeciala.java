package clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{

    MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(this.mijlocDeTransport.getTipCursa()==TipCursa.SPECIALA){
            System.out.println("Auotbuzul este intr o cursa speciala nu poate opri in statie");

        }
        else{
            this.mijlocDeTransport.opresteInStatie(statie);
        }

    }

    @Override
    public int getPasageri() {
        return mijlocDeTransport.getPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return mijlocDeTransport.getTipCursa();
    }
}
