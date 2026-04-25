package ro.ase.cts.clase.spital;

public class Medicament {
    private String nume;
    private float pret;


    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Medicamentul "+this.nume+ " a fost achizionat la pretul: "+this.pret+" ron");
        }
        System.out.println("Nu a prezentat reteta!!!");
    }

    public boolean prezintaReteta(){
      return  nume.length()>=10;

    }


}
