package ro.ase.cts.adapter;

import ro.ase.cts.clase.spital.Medicament;

public class Adapter extends ro.ase.cts.clase.farmacie.Medicament {
    private Medicament medicament;


    public Adapter(Medicament medicament) {
        super(medicament.getNume());
        this.medicament=medicament;
    }


    public void cumparaMedicament(){
        medicament.achizitioneazaMedicament();
    }
}
