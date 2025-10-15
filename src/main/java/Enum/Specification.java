package Enum;

public enum Specification {
    BUILDER,BACKWOOD,TOPWOOD,MODEL,TYPE,INSTRUMENT_TYPE,STYLE,NUMBER_OF_STRINGS,YEAR_OF_MANUFACTURE,;

    @Override
    public String toString() {
        switch (this) {
            case BUILDER: return "Builder";
            case BACKWOOD: return "Backwood";
            case TOPWOOD: return "Topwood";
            case MODEL: return "Model";
            case TYPE: return "Type";
            case INSTRUMENT_TYPE: return "InstrumentType";
            case STYLE: return "Style";
            case NUMBER_OF_STRINGS: return "NumberOfStrings";
            case YEAR_OF_MANUFACTURE: return "Year of Manufacture";
            default: return "Unspecified";
        }
    }
}
