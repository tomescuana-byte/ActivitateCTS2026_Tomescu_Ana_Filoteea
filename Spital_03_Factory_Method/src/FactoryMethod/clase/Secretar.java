package FactoryMethod.clase;

public class Secretar extends PersonalNMedical{
    public Secretar(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afisare() {
        StringBuilder sb=new StringBuilder();
        sb.append("Numele Secretarului este: ").append(super.nume);
        sb.append("are un numar de ani vechimde de: ").append(super.vechime);
        System.out.println(sb);
    }
}
