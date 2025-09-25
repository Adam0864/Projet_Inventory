public enum Wood {
    ADIRONDACK,CEDAR,COCOBOLO,MAHOGANY,MAPLE,SITKA;

    public String toString() {
        switch (this) {
            case ADIRONDACK: return "Adirondack";
            case CEDAR: return "Cedar";
            case COCOBOLO: return "Cocobolo";
            case MAHOGANY: return "Mahogany";
            case MAPLE: return "Maple";
            case SITKA: return "Sitka";
            default: return "Unspecified";
        }}}
