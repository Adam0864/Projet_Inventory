package InventoryV3.modele;

import Enum.*;
import java.util.Map;

public abstract class InstrumentSpec {
    private Map<Specification,Object> specifications;
    private Builder builder;
    private Wood backWood,topWood;
    private String model;
    private Type type;

    public InstrumentSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood) {
        specifications.put(Specification.BUILDER, builder);
        specifications.put(Specification.MODEL, model);
        specifications.put(Specification.TYPE, type);
        specifications.put(Specification.TOPWOOD, topWood);
        specifications.put(Specification.BACKWOOD, backWood);
    }

    public Map getSpecifications() {
        return specifications;
    }

    public Boolean matches(InstrumentSpec searchinstrument){
        if (searchinstrument..getSpecifications().get("BUILDER") != this.getSpecifications().get("BUILDER"))
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

    public String toString(){
        return "Enum.Builder " + builder + " Model " + model+ " Enum.Type "+type+ "BackWood "+backWood+" TopWood "+topWood;
    }
}
