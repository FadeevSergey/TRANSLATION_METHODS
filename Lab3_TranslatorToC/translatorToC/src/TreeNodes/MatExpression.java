package TreeNodes;

public class MatExpression extends NodeClass implements EqRight, Node{
    private final String expression;
    private final Types type;

    public MatExpression(String expr, Types type) {
        this.expression = expr;
        this.type = type;
    }

    public String getExpression() {
        return this.expression;
    }

    public Types getType() {
        return this.type;
    }

    public String toString(int padding) {
        return expression;
    }
}
