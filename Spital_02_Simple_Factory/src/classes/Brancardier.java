package classes;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseaza_descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Brancardierul cu numele de: ").append(super.nume);
        sb.append(" are vechimea de: ").append(super.vechime).append(" ani");
        System.out.println(sb.toString());
    }
}
