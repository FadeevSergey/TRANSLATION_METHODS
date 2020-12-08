package TreeNodes;

public class WhileBlock extends NodeClass implements Node {
    private final String condition;
    private final MainBlock body;

    public WhileBlock(String condition, MainBlock body) {
        this.condition = condition;
        this.body = body;
    }

    public String toString(int padding) {
        return getPadding(padding) + "while(" + condition.toString() + ")" + "\n" +
                getPadding(padding) + "{" + "\n" +
                body.toString(padding + 1) + "\n" +
                getPadding(padding + 1) + "}" + "\n";
    }
}
