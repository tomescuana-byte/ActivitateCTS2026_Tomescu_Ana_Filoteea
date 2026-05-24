package clase;

public class ReceptieRestaurant {
    private Ospatar ospatar;

    public ReceptieRestaurant(Ospatar ospatar) {
        this.ospatar = ospatar;
    }

    public void verificaMasa(Masa masa) {

        if(masa.esteLibera()) {

            if(ospatar.verificaDebarasare(masa)) {

                if(ospatar.verificaServetele(masa))
                {System.out.println("Masa " + masa.getNumarMasa() + " este pregatita pentru clienti.");

                } else {
                    System.out.println("Masa " + masa.getNumarMasa() + " nu are servetele noi.");
                }

            } else {
                System.out.println("Masa " + masa.getNumarMasa() + " nu este debarasata.");
            }

        } else {
            System.out.println("Masa " + masa.getNumarMasa()+ " nu este libera.");
        }
    }
}
