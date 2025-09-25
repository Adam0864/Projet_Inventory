public class MandolinSpec extends InstrumentSpec {
    private String model;
    private Builder builder;
    private Wood backWood,topWood;
    private Type type;
    private Style style;


    public MandolinSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood, Style style) {
        super(builder, model, type,topWood, backWood);
        this.style = style;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Type getType() {
        return type;
    }

    public Style getStyle() {
        return style;
    }

}
