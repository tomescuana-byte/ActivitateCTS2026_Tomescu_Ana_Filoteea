package ro.acs.cts.builder;

public class AutobuzLinieBuilder implements AbstractBuilder{
    private  boolean oprireCapat;
    private boolean deschideUsa;

    public AutobuzLinieBuilder() {
        this.oprireCapat = false;
        this.deschideUsa = false;
    }


    @Override
    public AutobuzLinie build(String numeSofer, String textDerulator) {
        return new AutobuzLinie(numeSofer,oprireCapat,deschideUsa,textDerulator);
    }

    @Override
    public AbstractBuilder setDeschideUsa(boolean deschideUsa) {
        this.deschideUsa=deschideUsa;
        return this;
    }

    @Override
    public AbstractBuilder setOpresteCapat(boolean opresteCapat) {
        this.oprireCapat=opresteCapat;
        return this;
    }
}
