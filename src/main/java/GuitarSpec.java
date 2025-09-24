public class GuitarSpec extends InstrumentSpec {
    private String model;
    private Builder builder;
    private Wood backWood,topWood;


    public GuitarSpec(Builder builder, String model, Wood backWood, Wood topWood) {
        super(builder, model, backWood, topWood);
    }
}
