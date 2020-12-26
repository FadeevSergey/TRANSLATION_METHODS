package TreeNodes;

public class JustIfBlock extends NodeClass implements Node {
    private final String condition;
    private final Node body;

    public JustIfBlock(String condition, Node body) {
        this.condition = condition;
        this.body = body;
    }

    public String getCondition() {
        return condition;
    }

    public Node getBody() {
        return body;
    }

    public String toString(int padding) {
        return getPadding(padding) + "if(" + condition + ")" + "\n" +
                getPadding(padding) + "{" + "\n" +
                body.toString(padding + 1) +
                getPadding(padding) + "}" + "\n";
    }
}
