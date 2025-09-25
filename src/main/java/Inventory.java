import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventory {
    private LinkedList instruments;

    public Inventory() {
        instruments = new LinkedList<>();
    }

    public void addInstrument(String SerialNumber,double price,InstrumentSpec instrumentSpec) {
        instruments.add((InstrumentFactory.createInstrument(SerialNumber,price,instrumentSpec)));
    }

    public List search(Instrument searchinstrument){
        List matchingInstruments = new LinkedList();
        for (Iterator i = instruments.iterator();i.hasNext();){
            Instrument instrument = (Instrument) i.next();

            if ()
        }
    }
}
