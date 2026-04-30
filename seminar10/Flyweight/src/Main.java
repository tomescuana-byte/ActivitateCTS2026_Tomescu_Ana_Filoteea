import clase.Autobuz;
import clase.ManagerLinie;

public class Main{
    static void main(String[] args) {
        Autobuz autobuz101=new Autobuz("Mercedes",1999,50);
        Autobuz autobuz102=new Autobuz("Otokar",2000,45);
        Autobuz autobuz103=new Autobuz("Eldela",2010,40);


        ManagerLinie managerLinie=new ManagerLinie();
        managerLinie.getLinie(101,"Romana","Universitate").numarMaximPasageriPeLinie(autobuz101);
        managerLinie.getLinie(101,"etct","fdfd").descriereLinie(autobuz101);
    }
}