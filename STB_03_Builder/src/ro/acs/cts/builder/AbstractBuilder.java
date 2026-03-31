package ro.acs.cts.builder;

public interface AbstractBuilder {
    AutobuzLinie build(String numeSofer,String textDerulator);
    AbstractBuilder setDeschideUsa(boolean deschideUsa);
    AbstractBuilder setOpresteCapat(boolean opresteCapat);
}
