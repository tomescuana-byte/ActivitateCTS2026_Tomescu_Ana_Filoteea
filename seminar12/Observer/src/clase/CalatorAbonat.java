package clase;

public class CalatorAbonat implements Calator{
    private String nume;

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String nrLinie) {
        System.out.println(this.nume+ "  "+nrLinie );
    }
}
