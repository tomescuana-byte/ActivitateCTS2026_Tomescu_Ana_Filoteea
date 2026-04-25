package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ReceptieSpital;
import ro.ase.cts.clase.Salon;

public class Main{
    static void main() {
        Pacient pacient =new Pacient("Gigel",5);
        Medic medic=new Medic();
        Salon salon=new Salon();


        if(medic.areTrimitere(pacient)){
            int patLiber=salon.getPatLiber();
            if(patLiber!= -1){
                System.out.println("Pacientul "+pacient.getNume()+ " va fi internal in patul "+ patLiber);
                salon.ocupaPat(patLiber);
            }
        }
        Pacient pacient2=new Pacient("George", 2);
        Pacient pacient3=new Pacient("Mihai", 1);
        Pacient pacient4=new Pacient("Dan", 7);

        ReceptieSpital receptieSpital1=new ReceptieSpital(medic, salon);
        receptieSpital1.interneazaPacient(pacient2);
        receptieSpital1.interneazaPacient(pacient3);
        receptieSpital1.interneazaPacient(pacient4);

    }
}