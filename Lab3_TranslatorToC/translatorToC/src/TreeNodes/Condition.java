package TreeNodes;

public class Condition extends NodeClass implements EqRight {
    private final String str;
    public Condition(String str) {
        this.str = str;
    }

    public Types getType() {
        return Types.Bool;
    }

    public String toString(int padding) {
        return str;
    }
}
