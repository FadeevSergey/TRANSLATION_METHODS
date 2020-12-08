package TreeNodes;

public class ForBlock extends NodeClass implements Node {
    private final Var var;
    private final Range range;
    private final MainBlock body;

    public ForBlock(Var var, Range range, MainBlock body) {
        VarTable.addVar(var.getName(), Types.Int);
        this.var = var;
        this.range = range;
        this.body = body;
    }

    public String toString(int padding) {
        return getPadding(padding) + "for(" + VarTable.getType(var.getName()).getCStyleType() + " " + var.toString(0) + " = " + range.getLeft().toString(0) + "; " + var.toString(0) + " < " + range.getRight().toString(0) + "; " + "++" + var.toString(0) + ")" + "\n" +
                getPadding(padding) + "{" + "\n" +
                body.toString(padding + 1) +
                getPadding(padding) + "}" + "\n";
    }
}
