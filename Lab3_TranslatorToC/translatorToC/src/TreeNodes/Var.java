package TreeNodes;

public class Var extends NodeClass implements Node {

    private final String str;
    private Types type;

    public Var(String str, Types type) {
        VarTable.addVar(str, type);
        this.str = str;
        this.type = type;
    }

    public String getName() {
        return this.str;
    }

    public Types getType() {
        return this.type;
    }

    public Var setType(Types type) {
        this.type = type;
        return this;
    }
    public String toString(int padding) {
        return str;
    }
}
