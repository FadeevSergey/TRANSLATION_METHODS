package TreeNodes;

import java.util.Collections;

public class Equating extends NodeClass implements Node {
    private final Var var;
    private final EqRight right;

    public Equating(Var var, EqRight right) {
        this.var = var;
        this.right = right;
    }

    public String toString(int padding) {
        String result;
        if(right instanceof ReadVar) {
            result = getPadding(padding) + right.toString(0) + ";\n";
        } else {
            result = getPadding(padding) + var.toString(0) + " = " + right.toString(0) + ";\n";
        }
        return result;
    }
}
