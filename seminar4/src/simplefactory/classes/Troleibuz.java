package simplefactory.classes;

public class Troleibuz extends Mijloc_transport{
    public Troleibuz(int nr_roti, String nr_inmatriculare) {
        super(nr_roti, nr_inmatriculare);
    }

    @Override
    public void afiseaza_descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append(" Troleibuzul are :numar roti: ").append(super.nr_roti);
        sb.append("Numar inmatriculare: ").append(super.nr_inmatriculare);
        System.out.println(sb.toString());
    }
}
