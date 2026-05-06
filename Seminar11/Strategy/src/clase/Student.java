package clase;

public class Student {
    private String nume;


    private ModSustinere modSustinere;


    public Student(String nume,ModSustinere modSustinere) {
        this.nume=nume;
        this.modSustinere = modSustinere;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student(String nume) {
        this.modSustinere=new ProbaGrila();
        this.nume=nume;

    }


    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
