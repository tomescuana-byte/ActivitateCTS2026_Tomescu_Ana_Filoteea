import clase.Client;
import clase.ManagerRezervare;
import clase.Masa;

public class Main{
    static void main(String[] args) {

            ManagerRezervare managerRezervare = new ManagerRezervare();

            Client client1 = managerRezervare.getClient("Ana", "0740064334", "tomescuana34@gmail.com");
            Client client2 = managerRezervare.getClient("Ana", "0740064334", "tomescuana34@gmail.com");

            Masa masa1 = new Masa(6, 3, "21:00");
            Masa masa2 = new Masa(5, 5, "15:00");

            masa1.descriereRezervare(client1);
            masa2.descriereRezervare(client2);
        }


    }