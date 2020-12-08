package TreeNodes;

public enum Types {
    Int("int", "d"),
    Char("char", "c"),
    Double("double", "lf"),
    Bool("bool", "d"),
    Unknown("unknown", "unknown");

    private final String type;
    private final String cCode;

    public String getCStyleType() {
        return this.type;
    }

    public String getCCode() {
        return this.cCode;
    }
    Types(String s1, String s) {
        this.type = s1;
        this.cCode = s;
    }
}
