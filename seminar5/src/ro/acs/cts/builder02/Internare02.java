package ro.acs.cts.builder02;

public class Internare02 {
    private boolean pat_rabatabil;
    private boolean mic_dejun_inclus;
    private boolean papuci_camera;
    private boolean halat;
    private String nume_pacient;

    public Internare02(boolean pat_rabatabil, boolean mic_dejun_inclus, boolean papuci_camera, boolean halat, String nume_pacient) {
        this.pat_rabatabil = pat_rabatabil;
        this.mic_dejun_inclus = mic_dejun_inclus;
        this.papuci_camera = papuci_camera;
        this.halat = halat;
        this.nume_pacient = nume_pacient;
    }

    public void setPat_rabatabil(boolean pat_rabatabil) {
        this.pat_rabatabil = pat_rabatabil;
    }

    public void setMic_dejun_inclus(boolean mic_dejun_inclus) {
        this.mic_dejun_inclus = mic_dejun_inclus;
    }

    public void setPapuci_camera(boolean papuci_camera) {
        this.papuci_camera = papuci_camera;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    public void setNume_pacient(String nume_pacient) {
        this.nume_pacient = nume_pacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("pat_rabatabil=").append(pat_rabatabil);
        sb.append(", mic_dejun_inclus=").append(mic_dejun_inclus);
        sb.append(", papuci_camera=").append(papuci_camera);
        sb.append(", halat=").append(halat);
        sb.append(", nume_pacient='").append(nume_pacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
