package clase;

public class CalatorieAutobuz extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<5){
            return "Auotbuz";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
