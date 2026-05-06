import clase.ProbaOrala;
import clase.ProbaScrisa;
import clase.Student;

public class Main{
    static void main(String[] args) {
        Student student=new Student("ANA");
        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();


        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}