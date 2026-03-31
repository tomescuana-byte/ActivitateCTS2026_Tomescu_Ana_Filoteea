package ro.acs.cts.builder01;

public interface AbstractBuilder {
        Rezervare build(String numeClient);
        AbstractBuilder setLaGeam(boolean laGeam);
        AbstractBuilder setScauneE(boolean scauneE);
        AbstractBuilder setDecorareMasa(boolean decorareMasa);
        AbstractBuilder setGenMuzica(boolean genMuzica);
}
