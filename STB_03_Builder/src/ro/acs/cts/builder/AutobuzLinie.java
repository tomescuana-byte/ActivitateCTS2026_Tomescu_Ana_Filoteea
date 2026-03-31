package ro.acs.cts.builder;

public class AutobuzLinie {
    private final String numeSofer;
    private final boolean oprireCapat;
    private final boolean deschideUsa;
    private final String textDerulator;


    public AutobuzLinie(String numeSofer, boolean oprireCapat, boolean deschideUsa, String textDerulator) {
        this.numeSofer = numeSofer;
        this.oprireCapat = oprireCapat;
        this.deschideUsa = deschideUsa;
        this.textDerulator = textDerulator;
    }

    public AutobuzLinie() {
        numeSofer=" ";
        oprireCapat=false;
        deschideUsa=false;
        textDerulator=" ";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", oprireCapat=").append(oprireCapat);
        sb.append(", deschideUsa=").append(deschideUsa);
        sb.append(", textDerulator='").append(textDerulator).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
