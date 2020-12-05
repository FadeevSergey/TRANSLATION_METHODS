package TreeNodes;

public class JustIfBlock implements Node {
    private final Node condition;
    private final Node body;

    public JustIfBlock(Node condition, Node body) {
        this.condition = condition;
        this.body = body;
    }

    public Node getCondition() {
        return condition;
    }

    public Node getBody() {
        return body;
    }
}
