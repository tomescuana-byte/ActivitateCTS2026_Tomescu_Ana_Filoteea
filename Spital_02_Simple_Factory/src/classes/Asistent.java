package classes;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseaza_descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Asistentul cu numele de: ").append(super.nume);
        sb.append(" are vechimea de: ").append(super.vechime).append(" ani");
        System.out.println(sb.toString());
    }
}
