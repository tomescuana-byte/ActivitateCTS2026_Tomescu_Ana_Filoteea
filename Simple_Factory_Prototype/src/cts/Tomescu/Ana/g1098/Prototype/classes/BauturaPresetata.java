package cts.Tomescu.Ana.g1098.Prototype.classes;

import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.Bautura;
import cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes.factories.Tipuri;

public class BauturaPresetata implements BauturaAbstracta {
    protected String nume;
    protected int volum;
    protected double pret;
    Tipuri tip;


    public BauturaPresetata() {
    }

    public BauturaPresetata(String nume, int volum, double pret, Tipuri tip) {
        if(nume.length()>3) {
            this.nume = nume;
        }
        else{
            this.nume="apa";
        }
        if(volum>150) {
            this.volum = volum;
        }
            else{
                this.volum=150;
        }
        if(pret>10){
            this.pret = pret;
            }
        else{
            this.pret=10;
        }
        this.tip=tip;
    }


    @Override
    public BauturaAbstracta clone() {
        BauturaPresetata bautura_noua=new BauturaPresetata();
        bautura_noua.nume=this.nume;
        bautura_noua.volum=this.volum;
        bautura_noua.pret=this.pret;
        bautura_noua.tip=this.tip;
        return bautura_noua;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BauturaPresetata{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append(", tip=").append(tip);
        sb.append('}');
        return sb.toString();
    }

    public void setPret(double pret) {
        if (pret > 18) {
            this.pret = pret;
        } else {
            this.pret = 18;
        }
    }
}

