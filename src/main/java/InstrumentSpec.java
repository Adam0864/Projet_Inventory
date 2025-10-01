import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class InstrumentSpec {
    protected Builder builder;
    protected Wood backWood,topWood;
    protected String model;
    protected Type type;

    public InstrumentSpec(Builder builder, String model,Type type, Wood topWood, Wood backWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Boolean matches(InstrumentSpec searchinstrument){
        if (searchinstrument.getBuilder() != this.getBuilder())
            return false;

        String model = searchinstrument.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) && (!model.equals(this.getModel().toLowerCase())))
            return false;

        if (searchinstrument.getType() != this.getType())
            return false;

        if (searchinstrument.getBackWood() != this.getBackWood())
            return false;

        if  (searchinstrument.getTopWood() != this.getTopWood())
            return false;

        return true;
    }
}
