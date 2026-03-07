package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;
    private static int VALOARE_FINANTARE_STUDENT=20;

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }


    public Student() {
        super();

    }

    @Override
    public void afiseazaFinantare() {
        System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+VALOARE_FINANTARE_STUDENT+" Euro/zi in proiect.");

    }
    @Override
    public String toString() {
        return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte +  ", DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate + ", An_studii=" + an_studii ;
    }

    public static void setValoareFinantareStudent(int valoareFinantareStudent) {
        VALOARE_FINANTARE_STUDENT = valoareFinantareStudent;
    }
}