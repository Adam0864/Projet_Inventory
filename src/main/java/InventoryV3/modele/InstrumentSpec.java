package InventoryV3.modele;

import Enum.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstrumentSpec {
    private Map<Specification,Object> specifications;

    public InstrumentSpec(List listSpe) {
        this.specifications = new HashMap<>();
        for (int i=0;i<listSpe.size();i+=2) {
            Specification key = (Specification) listSpe.get(i);
            Object value = listSpe.get(i+1);
            specifications.put(key,value);
        }
    }

    public Map<Specification,Object> getSpecifications() {
        return specifications;
    }

    public Builder getBuilder() {
        return (Builder) specifications.get(Specification.BUILDER);
    }

    public Wood getTopWood() {
        return (Wood) specifications.get(Specification.TOPWOOD);
    }

    public Wood getBackWood() {
        return (Wood) specifications.get(Specification.BACKWOOD);
    }

    public String getModel() {
        return (String) specifications.get(Specification.MODEL);
    }

    public Type getType() {
        return (Type) specifications.get(Specification.TYPE);
    }

    public Boolean matches(InstrumentSpec searchinstrument){
        for  (Specification speci : searchinstrument.getSpecifications().keySet()) {
            if (this.specifications.containsKey(speci)) {
                if (!(searchinstrument.getSpecifications().get(speci).equals(this.specifications.get(speci)))) {
                    return false;
                }
            }
        }

        return true;
    }

    public String toString(){
        return "Specifications : " + this.specifications.toString();
    }
}
