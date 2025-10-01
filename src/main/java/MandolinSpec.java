public class MandolinSpec extends InstrumentSpec {
    private Style style;


    public MandolinSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood, Style style) {
        super(builder, model, type,topWood, backWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public Boolean matches(InstrumentSpec instrumentSpec) {
        return instrumentSpec instanceof MandolinSpec &&
                this.style == ((MandolinSpec)instrumentSpec).getStyle() &&
                 super.matches(instrumentSpec);
    }

    public String toString() {
        return super.toString() + "Style " + style;
    }

}
