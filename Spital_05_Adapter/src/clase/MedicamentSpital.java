package clase;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        if(prezintaReteta()) {
            System.out.println("Medicamentul " + nume + " a fost achizitionat");
        } else {
            System.out.println("Nu a prezentat reteta!");
        }
    }

    public boolean prezintaReteta() {
        return nume.length() >= 10;
    }
}
