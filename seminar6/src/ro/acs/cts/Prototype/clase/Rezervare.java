package ro.acs.cts.Prototype.clase;

public class Rezervare implements RezervareAbstract{
    protected String nume;
    protected int ora;
    protected int ziua;
    protected String nr_telefon;

    private Rezervare() {
    }

    public Rezervare(String nume, int ora, int ziua, String nr_telefon) {
        if(nume.length()>3){
            this.nume = nume;
        }
        else{
            this.nume="Ion";
        }
        if(ora<23 ||ora>9){
            this.ora = ora;
        }
        else{
            this.ora = 9;
        }

        if(ziua<31){
            this.ziua = ziua;
        }
       else{
            this.ziua = 1;
        }

       if(nr_telefon.length()==10){
           this.nr_telefon = nr_telefon;
       }
       else {
           this.nr_telefon = "0768584616";
       }
    }

    @Override
    public RezervareAbstract clone() {
        Rezervare rezervare_noua=new Rezervare();
        rezervare_noua.nume=this.nume;
        rezervare_noua.nr_telefon=this.nr_telefon;
        rezervare_noua.ora=this.ora;
        rezervare_noua.ziua=this.ziua;
        rezervare_noua.nr_telefon=this.nr_telefon;
        return rezervare_noua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", ziua=").append(ziua);
        sb.append(", nr_telefon='").append(nr_telefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setZiua(int ziua) {
        if(ziua<31){
            this.ziua = ziua;
        }
        else{
            this.ziua = 1;
        }
    }

    public void setOra(int ora) {
        if(ora<23 ||ora>9){
            this.ora = ora;
        }
        else{
            this.ora = 9;
        }
    }
}
