package InventoryV2.modele;

public abstract class Instrument {
    protected String serialNumber;
    protected double price;
    protected InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    public String toString() {
        return "Serial Number : " +serialNumber +" prix : "+ price + " " + instrumentSpec;
    }
}
