package clase;

public class Autobuz {
    private String producator;


    public Autobuz(String producator) {
        this.producator = producator;
    }

    public void pleacaPeTraseu(int nrLinie){
        System.out.println("Auotobuzul "+this.producator+" porneste pe traseul "+nrLinie);
    }
}
