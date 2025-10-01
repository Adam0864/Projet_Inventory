public enum Wood {
    ALDER,ADIRONDACK,CEDAR,COCOBOLO,MAHOGANY,MAPLE,SITKA,INDIAN_ROSEWOOD,BRAZILIAN_ROSEWOOD;

    public String toString() {
        switch (this) {
            case ALDER: return "Alder";
            case ADIRONDACK: return "Adirondack";
            case CEDAR: return "Cedar";
            case COCOBOLO: return "Cocobolo";
            case MAHOGANY: return "Mahogany";
            case MAPLE: return "Maple";
            case SITKA: return "Sitka";
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
            default: return "Unspecified";
        }}}
