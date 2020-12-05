package TreeNodes;

public class Var implements Node {

    private final String str;
    private final Types type;

    public Var(String str, Types type) {
        this.str = str;
        this.type = type;
    }

    public String getString() {
        return this.str;
    }

    public Types getType() {
        return this.type;
    }
}
