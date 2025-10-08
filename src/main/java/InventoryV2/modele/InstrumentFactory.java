package InventoryV2.modele;

public class InstrumentFactory {

    public static Instrument createInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        Instrument instrument = null;
        if (instrumentSpec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber,price,(GuitarSpec) instrumentSpec);
        }
        if (instrumentSpec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber,price,(MandolinSpec) instrumentSpec);
        }
        return instrument;
    }
}
