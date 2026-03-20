package classes;

public class Supa_legume extends Supa{
    public Supa_legume(int calorii, float gramaj) {
        super(calorii, gramaj);
    }

    @Override
    public void afiseaza_descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Supa de legume are numarul caloriilor egal cu: ").append(super.calorii);
        sb.append(" si gramajul este: ").append(super.gramaj);
        System.out.println(sb.toString());
    }
}
