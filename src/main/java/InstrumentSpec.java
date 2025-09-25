public class InstrumentSpec {
    private Builder builder;
    private Wood backWood,topWood;
    private String model;
    private Type type;

    public InstrumentSpec(Builder builder, String model,Type type, Wood topWood, Wood backWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
    }
}
