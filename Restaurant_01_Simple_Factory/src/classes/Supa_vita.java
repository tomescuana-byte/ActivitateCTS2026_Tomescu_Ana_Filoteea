package classes;

public class Supa_vita extends Supa{
    public Supa_vita(int calorii, float gramaj) {
        super(calorii, gramaj);
    }

    @Override
    public void afiseaza_descriere() {
        StringBuilder sb= new StringBuilder();
        sb.append("Supa de vita are nr caloriilor egal cu: ").append(super.calorii);
        sb.append("si gramajul: ").append(super.gramaj);
        System.out.println(sb.toString());
    }
}
