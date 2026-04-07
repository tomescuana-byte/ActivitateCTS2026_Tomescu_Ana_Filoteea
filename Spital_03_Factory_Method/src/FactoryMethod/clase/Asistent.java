package FactoryMethod.clase;

public class Asistent  extends PersonalMedical {
    public Asistent(String nume, int vechime, double salariu) {
        super(nume, vechime, salariu);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Numele Asistentulu este: ").append(super.nume);
        sb.append("are un numar de ani vechimde de: ").append(super.vechime);
        sb.append(" si un salariu in valoare de: ").append(super.salariu);
        System.out.println(sb);
    }
}
