package ro.acs.cts.builder02;

import ro.acs.cts.builder01.Internare;
import ro.acs.cts.builder02.Internare02;

public interface AbstractBuilder02 {
       Internare02 build(String nume);
       AbstractBuilder02 setPatRabatabil(boolean pat_rabatabil);
       AbstractBuilder02 setArePapuci(boolean are_papuci);
       AbstractBuilder02 setMic_dejun(boolean mic_dejun);
       AbstractBuilder02 setare_halat(boolean are_halat);



}
