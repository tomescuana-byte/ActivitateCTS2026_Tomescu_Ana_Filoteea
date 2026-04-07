package FactoryMethod.clase;

public abstract class PersonalNMedical implements PersonalSpital{
    protected String nume;
    protected int vechime;

    public PersonalNMedical(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
