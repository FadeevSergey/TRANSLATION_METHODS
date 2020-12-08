package TreeNodes;

public class ReadVar extends NodeClass implements EqRight{
    private final Var var;
    private final Types type;

    public ReadVar(Var var, Types type) {
        this.var = var;
        this.type = type;
    }

    public Types getType() {
        return this.type;
    }

    public String toString(int padding) {
        return getPadding(padding) + "scanf(\"%" + type.getCCode() + "\", &" + var.getName() + ")";
    }
}
