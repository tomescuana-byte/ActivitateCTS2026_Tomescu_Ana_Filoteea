package FactoryMethod.clase;

public abstract class PersonalMedical implements PersonalSpital {
    protected String nume;
    protected int vechime;
    protected double salariu;


    public PersonalMedical(String nume, int vechime, double salariu) {
        this.nume = nume;
        this.vechime = vechime;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
