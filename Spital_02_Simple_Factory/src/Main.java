import classes.PersonalSpital;
import factories.Spital;
import factories.Tipuri;

public class Main {
    public static void main(String[] args) {
        Spital spital=new Spital();
        PersonalSpital asistent=spital.getPersonalSpital(Tipuri.ASISTENT,"Ana",10);
        PersonalSpital medic=spital.getPersonalSpital(Tipuri.MEDIC,"Annie",15);
        PersonalSpital brancardier=spital.getPersonalSpital(Tipuri.BRANCARDIER,"Deni",20);
        asistent.afiseaza_descriere();
        medic.afiseaza_descriere();
        brancardier.afiseaza_descriere();

    }
}