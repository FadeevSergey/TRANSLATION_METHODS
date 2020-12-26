package TreeNodes;

public class Print extends NodeClass implements Node {
    private final Node expr;

    public Print(Node expr) {
        this.expr = expr;
    }

    public String toString(int padding) {
        if(expr instanceof Var) {
            return getPadding(padding) + "printf(\"%" + VarTable.getType(((Var)expr).getName()).getCCode() + "\\n\", " + expr.toString(0) + ");" + "\n";
        } else if(expr instanceof Condition) {
            return getPadding(padding) + "printf(\"%s\\n\", " + "(" + expr.toString(0) + ")" + " ? " + "\"true\" : \"false\");" + "\n";
        } else if(expr instanceof MathExpression) {
            Var tempPrintVar = new Var("__temp_print_var" + expr.hashCode(), Types.Bool);
            NewVar tempNewVar = new NewVar(ConstOrVar.LET, tempPrintVar, ((MathExpression)expr).getType(), (MathExpression)expr);
            String result = tempNewVar.toString(padding);
            result += getPadding(padding) + "printf(\"%" + ((MathExpression) expr).getType().getCCode() + "\\n\", " + tempPrintVar.getName() + ");" + "\n";
            return result;
        }
        throw new Error();
    }
}
