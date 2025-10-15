package InventoryV3.modele;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private LinkedList instruments;

    public Inventory() {
        instruments = new LinkedList<>();
    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public List search(InstrumentSpec searchinstrument){
        List matchingInstruments = new LinkedList();
        for (Iterator i = instruments.iterator();i.hasNext();){
            Instrument instrument = (Instrument) i.next();

            if (searchinstrument.matches(instrument.getInstrumentSpec()))
                matchingInstruments.add(instrument);
        }
        return matchingInstruments;
    }
}
