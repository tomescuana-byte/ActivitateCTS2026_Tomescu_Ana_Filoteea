package cts.tomescu.ana.g1098.pattern.prototype;

public class Autobuz implements AutobuzAbstract {
        protected int nr_locuri;
        protected String culoare;
        protected float pret;


    public Autobuz() {
    }

    public Autobuz(int nr_locuri, String culoare, float pret) {
        if (nr_locuri > 30) {
            this.nr_locuri = nr_locuri;
        } else {
            this.nr_locuri = 18;
        }
        if (culoare.equals("Albastru")) {
            this.culoare = culoare;
        } else {
            this.culoare = "galben";
        }
        if (pret == 100) {
            this.pret = pret;
        } else {
            this.pret = 200;
        }
    }

    @Override
    public AutobuzAbstract clone() {
        Autobuz autobuz_nou=new Autobuz();
        autobuz_nou.nr_locuri=this.nr_locuri;
        autobuz_nou.culoare=this.culoare;
        autobuz_nou.pret=this.pret;
        return autobuz_nou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nr_locuri=").append(nr_locuri);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public void setNr_locuri(int nr_locuri) {
        if (nr_locuri > 30) {
            this.nr_locuri = nr_locuri;
        } else {
            this.nr_locuri = 18;
        }
    }
}
