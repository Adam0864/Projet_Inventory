package InventoryV2.modele;

public class Mandolin extends Instrument {

    public Mandolin(String serialNumber, double price, MandolinSpec mandolinSpec) {
        super(serialNumber,price, mandolinSpec);
    }

    @Override
    public String toString() {
        return "InventoryV2.modele.Mandolin " + price + " " + instrumentSpec;
    }

}
