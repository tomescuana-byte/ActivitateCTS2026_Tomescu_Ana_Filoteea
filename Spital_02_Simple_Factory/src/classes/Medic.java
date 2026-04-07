package classes;

public class Medic extends PersonalSpital{
    public Medic(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseaza_descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Medicul cu numele de: ").append(super.nume);
        sb.append(" are vechimea de: ").append(super.vechime).append(" ani");
        System.out.println(sb.toString());
    }
}
