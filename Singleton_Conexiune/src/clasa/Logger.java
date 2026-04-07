package clasa;

public class Logger {
    private int nr_mesaje;
    private static Logger instance=null;


    private Logger() {
        this.nr_mesaje = 0;
        System.out.println("Logger creat");
    }


    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }

        return instance;
    }

    public void log(String mesaj){
        nr_mesaje++;
        System.out.println("Log"+nr_mesaje+": "+mesaj);
    }
}
