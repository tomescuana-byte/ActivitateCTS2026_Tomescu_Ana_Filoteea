package clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerRezervare {
    Map<String,Client> registru=new HashMap<>();
    public Client getClient(String nume,String telefon, String email){
        if(registru.containsKey(telefon)){
            return registru.get(telefon);
        }
        else{
            registru.put(telefon,new Client(nume,telefon,email));
            return registru.get(telefon);
        }
    }
}
