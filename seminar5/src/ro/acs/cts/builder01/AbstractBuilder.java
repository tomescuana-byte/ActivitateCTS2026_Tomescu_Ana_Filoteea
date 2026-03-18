package ro.acs.cts.builder01;

public interface AbstractBuilder {
       Internare build();
       AbstractBuilder setNume(String nume_pacient);
       AbstractBuilder setPatRabatabil(boolean pat_rabatabil);
       AbstractBuilder setArePapuci(boolean are_papuci);
       AbstractBuilder setMic_dejun(boolean mic_dejun);
       AbstractBuilder setare_halat(boolean are_halat);



}
