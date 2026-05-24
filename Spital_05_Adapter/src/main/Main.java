package main;

import adapter.AdapterMedicament;
import clase.IMedicamentFarmacie;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class Main{
    static void main(String[] args) {
        IMedicamentFarmacie paracetamol =new MedicamentFarmacie("Paracetamol");
        MedicamentSpital algocalmin = new MedicamentSpital("Nurofen", 200);
        IMedicamentFarmacie adapter = new AdapterMedicament(algocalmin);
        paracetamol.cumparaMedicament();
        adapter.cumparaMedicament();

    }
}