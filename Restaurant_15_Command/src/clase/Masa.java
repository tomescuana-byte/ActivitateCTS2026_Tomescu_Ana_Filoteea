package clase;

public class Masa {
    private int numar;

    public Masa(int numar) {
        this.numar = numar;
    }

    public void rezerva(int nrRezervare){
        System.out.println("Masa cu numarul "+this.numar+" are nuamrul de rezervare "+nrRezervare);
    }

    public void ocupa(int nrPersoane){
        System.out.println("Masa cu numarul "+this.numar+" este ocupata de "+nrPersoane+" persoane");
    }
}
