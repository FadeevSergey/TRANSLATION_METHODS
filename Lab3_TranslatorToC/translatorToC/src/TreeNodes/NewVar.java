package TreeNodes;

public class NewVar {
    private final ConstOrVar mutable;
    private final Var var;
    private final Types type;
    private final EqRight right;

    public NewVar(ConstOrVar mutable, Var var, Types type, EqRight right) {
        this.mutable = mutable;
        this.var = var;
        this.type = type;
        this.right = right;
    }
}
