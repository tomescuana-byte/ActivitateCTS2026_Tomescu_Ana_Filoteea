package ro.acs.cts.builder01;

public class Rezervare {
    private boolean laGeam;
    private boolean scauneE;
    private boolean decorareMasa;
    private boolean genMuzica;
    private String numeClient;


    public Rezervare(boolean laGeam, boolean scauneE, boolean decorareMasa, boolean genMuzica, String numeClient) {
        this.laGeam = laGeam;
        this.scauneE = scauneE;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
        this.numeClient = numeClient;
    }

    public Rezervare() {
        laGeam=false;
        scauneE=false;
        decorareMasa=false;
        genMuzica=false;
        numeClient="Annie";
    }

    public void setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
    }

    public void setScauneE(boolean scauneE) {
        this.scauneE = scauneE;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("laGeam=").append(laGeam);
        sb.append(", scauneE=").append(scauneE);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
