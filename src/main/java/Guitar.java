public class Guitar extends Instrument{
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        super(serialNumber,price,guitarSpec);
    }

    // Guetteur pour serialNumber
    public String getSerialNumber() {
        return serialNumber;
    }

    // Guetteur pour price
    public double getPrice() {
        return price;
    }

    // Guetteur pour guitarSpec
    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}
