package cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes;

public class Cafea extends Bautura{
    public Cafea(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void metodaPreparare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Cafeaua: ").append(super.nume);
        sb.append(" se prepara folosind un volum de apa de: ").append(super.volum);
        sb.append(" mililitri").append(" si costa: ").append(super.pret).append(" lei");
        System.out.println(sb.toString());
    }
}
