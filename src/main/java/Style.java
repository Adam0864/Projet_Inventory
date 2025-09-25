public enum Style {
    A,F;

    public String toString() {
        switch (this) {
            case A: return "Amande";
            case F: return "Florentin";
            default: return "Unspecified";
        }
    }
}
