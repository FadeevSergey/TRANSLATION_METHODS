package TreeNodes;

public class NewVar extends NodeClass implements Node {
    private final ConstOrVar mutable;
    private final Var var;
    private final Types type;
    private final EqRight right;

    public NewVar(ConstOrVar mutable, Var var, Types type, EqRight right) {
        this.mutable = mutable;
        this.var = var;
        this.right = right;

        if(right != null) {
            this.type = right.getType();
        } else {
            this.type = type;
        }


        VarTable.addVar(var.getName(), this.type);
    }

    public String toString(int padding) {
        String result = getPadding(padding);

        if(mutable == ConstOrVar.VAR || !(right instanceof ReadVar)) {
            if(mutable == ConstOrVar.LET) {
                result += "const ";
            }

            result += type.getCStyleType() + " ";
            result += var.toString(0);
            if(right != null) {
                if(right instanceof ReadVar) {
                    result += ";\n";
                    result += right.toString(padding);
                } else {
                    result += " = " + right.toString(0);
                }
            }
            result += ";\n";
        } else {
            String tempVarName = "__temp_var_" + var.toString(0) + "__";
            result += type.getCStyleType() + " ";
            result += tempVarName;
            ReadVar newReadVar = new ReadVar(new Var(tempVarName, type), type);
            result += ";\n";
            result += newReadVar.toString(padding) + ";\n";
            result += getPadding(padding) + "const " + type.getCStyleType() + " " + var.toString(0) + " = " + tempVarName + ";\n";
        }
        return result;
    }
}
