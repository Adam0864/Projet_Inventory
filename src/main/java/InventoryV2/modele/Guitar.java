package InventoryV2.modele;

public class Guitar extends Instrument {

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        super(serialNumber,price,guitarSpec);
    }

    @Override
    public String toString() {
        return "InventoryV2.modele.Guitar " + super.toString();
    }
}
