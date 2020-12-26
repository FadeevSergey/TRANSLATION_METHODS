package TreeNodes;

public class DoWhileBlock extends NodeClass implements Node {
    private final String condition;
    private final MainBlock body;

    public DoWhileBlock(String condition, MainBlock body) {
        this.condition = condition;
        this.body = body;
    }

    public String toString(int padding) {
        return getPadding(padding) +  "do " + "\n" +
                getPadding(padding) + "{" + "\n" +
                body.toString(padding + 1) +
                getPadding(padding) + "}" + " while (" + condition + ");" + "\n";

    }
}
