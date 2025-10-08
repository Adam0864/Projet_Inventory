package Enum;

public enum Specification {
    BUILDER,BACKWOOD,TOPWOOD,MODEL,TYPE,STYLE,NBCORDES;

    public String toString() {
        switch (this) {
            case BUILDER: return "Builder";
            case BACKWOOD: return "Backwood";
            case TOPWOOD: return "Topwood";
            case MODEL: return "Model";
            case TYPE: return "Type";
            case STYLE: return "Style";
            case NBCORDES: return "NBCORDES";
            default: return "Unspecified";
        }
    }
}
