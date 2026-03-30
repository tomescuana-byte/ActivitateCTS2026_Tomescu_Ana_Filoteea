package acs.cts.prototype;

public class Reteta implements RetetaAbstract{
    protected String denumire;
    protected int cantitate;
    protected double concentratie;

    public Reteta() {
    }

    public Reteta(String denumire, int cantitate, double concentratie) {

        if(denumire.equals("Paracetamol")){
            this.denumire = denumire;
        }
        else{
            this.denumire="Aerius";
        }
        if(cantitate>50){
            this.cantitate = cantitate;
        }
        else{
            this.cantitate=30;

        }
        if(concentratie==20.67) {
            this.concentratie = concentratie;
        }
        else{
            this.concentratie=40.00;
        }
    }

    @Override
    public RetetaAbstract clone() {
        Reteta reteta_noua=new Reteta();
        reteta_noua.denumire=this.denumire;
        reteta_noua.cantitate=this.cantitate;
        reteta_noua.concentratie=this.concentratie;
        return reteta_noua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append(", concentratie=").append(concentratie);
        sb.append('}');
        return sb.toString();
    }

    public void setCantitate(int cantitate) {
        if(cantitate>50){
            this.cantitate = cantitate;
        }
        else{
            this.cantitate=30;

        }
    }
}
