package clasa;

public class ConexiuneDB {
    private String url;
    private static ConexiuneDB instance=null;


    private ConexiuneDB(String url) {
        this.url = url;
        System.out.println("Conexiune creata");
    }

    public static ConexiuneDB getInstance(String url){
        if(instance==null){
            instance= new ConexiuneDB(url);
        }
        return instance;
    }


    public void conecteaza(){
        System.out.println("Conectat la baza de date: "+ url);
    }

}
