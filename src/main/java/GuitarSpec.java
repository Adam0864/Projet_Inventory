public class GuitarSpec extends InstrumentSpec {
    private int nbCordes;


    public GuitarSpec(Builder builder, String model,Type type, Wood topWood, Wood backWood,int nbCordes) {
        super(builder, model, type,topWood, backWood);
        this.nbCordes = nbCordes;
    }

    public int getNbCordes() {
        return nbCordes;
    }

    public Boolean matches(InstrumentSpec instrumentSpec) {
        if (! (instrumentSpec instanceof GuitarSpec)) {
            return false;
        }
        if (this.nbCordes!= (((GuitarSpec)instrumentSpec).getNbCordes()))
            return false;
        return super.matches(instrumentSpec);
    }

    public String toString() {
        return "Builder " + builder + " Model " + model+ " Type "+type+ "BackWood "+backWood+" TopWood "+topWood+ "nbCordes " + nbCordes;
    }
}
