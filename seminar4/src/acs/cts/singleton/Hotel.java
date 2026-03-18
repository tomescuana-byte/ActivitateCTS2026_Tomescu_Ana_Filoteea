package acs.cts.singleton;


//lazy initialization daca vrem multi thread scriem synchronized

public class Hotel {
    private String nume_hotel;
    private int nr_camere;
    private int nr_camere_ocupate;
    private static  Hotel instance=null;


    private Hotel(String nume_hotel, int nr_camere, int nr_camere_ocupate) {
        this.nume_hotel = nume_hotel;
        this.nr_camere = nr_camere;
        this.nr_camere_ocupate = nr_camere_ocupate;
    }

    public static synchronized Hotel getInstance(String nume_hotel,int nr_camere,int nr_camere_ocupate){
        if(instance==null){
            instance = new Hotel(nume_hotel, nr_camere, nr_camere_ocupate);
        }
        return instance;
    }

    public void rezerva_camera(){
        if(this.nr_camere_ocupate<this.nr_camere){
            System.out.println("Rezervarea a fost realizata!");
            nr_camere_ocupate++;
        }
        else{
            System.out.println("Nu sunt camere disponibile");
        }

    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Hotel{");
//        sb.append("nume_hotel='").append(nume_hotel).append('\'');
//        sb.append(", nr_camere=").append(nr_camere);
//        sb.append(", nr_camere_ocupate=").append(nr_camere_ocupate);
//        sb.append('}');
//        return sb.toString();
//    }

    public void afiseaza_detalii_hotel(){
        final StringBuilder sb= new StringBuilder();
        sb.append("nume_hotel='").append(this.nume_hotel).append('\'');
        sb.append(", nr_camere=").append(this.nr_camere);
        sb.append(", nr_camere_ocupate=").append(this.nr_camere_ocupate);
        sb.append('}');
        System.out.println(sb);
    }



}
