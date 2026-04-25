package ro.ase.cts.main;

import ro.ase.cts.adapter.Adapter;
import ro.ase.cts.clase.spital.Medicament;



public class Main {
    public static void procurareMedicament(ro.ase.cts.clase.farmacie.Medicament medicamentF){
        medicamentF.cumparaMedicament();
    }
    public static void main(String[] args) {


        Medicament algocalmin = new Medicament("Algocalmin", 200);
        ro.ase.cts.clase.farmacie.Medicament paracetamol = new ro.ase.cts.clase.farmacie.Medicament("Paracetamol");
        algocalmin.achizitioneazaMedicament();
        paracetamol.cumparaMedicament();

        procurareMedicament(paracetamol);
        //procurareMedicament(algocalmin);

        Adapter adapter= new Adapter(algocalmin);

    }
}