package cts.Tomescu.Ana.g1098.pattern.simpleFactory.classes;

public abstract class Bautura {
    protected String nume;
    protected int volum;
    protected double pret;


    public Bautura(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public void metodaPreparare(){

    }

}
