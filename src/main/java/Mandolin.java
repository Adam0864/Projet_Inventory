public class Mandolin extends Instrument{
    private String serialNumber;
    private double price;
    private InstrumentSpec mandolineSpec;

    public Mandolin(String serialNumber, double price, MandolinSpec mandolinSpec) {
        super(serialNumber,price, mandolinSpec);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentSpec getMandolineSpec() {
        return mandolineSpec;
    }

}
