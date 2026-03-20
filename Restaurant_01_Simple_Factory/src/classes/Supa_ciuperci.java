package classes;

public class Supa_ciuperci extends Supa{
    public Supa_ciuperci(int calorii, float gramaj) {
        super(calorii, gramaj);
    }

    @Override
    public void afiseaza_descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de ciuperci are nr de calorii egal cu: ").append(super.calorii);
        sb.append("si are gramajul: ").append(super.gramaj);
        System.out.println(sb.toString());
    }
}
