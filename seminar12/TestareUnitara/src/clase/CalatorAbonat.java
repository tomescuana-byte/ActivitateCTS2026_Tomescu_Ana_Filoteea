package clase;


public class CalatorAbonat {
    private String nume;
    private float sold;


    public void platesteBilet(float pret) {
        if (sold > pret) {
            System.out.println(this.nume + " plateste " + pret + " pentru o calatorie");
            sold -= pret;
        } else {
            System.out.println("Sold insuficient!");
        }
    }


    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }
}

