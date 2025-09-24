public class InstrumentSpec {
    private Builder builder;
    private Wood backWood,topWood;
    private String model;
    private Type type;

    public InstrumentSpec(Builder builder, String model,Type type, Wood backWood, Wood topWood) {
        this.builder = builder;

        this.backWood = backWood;
    }
}
