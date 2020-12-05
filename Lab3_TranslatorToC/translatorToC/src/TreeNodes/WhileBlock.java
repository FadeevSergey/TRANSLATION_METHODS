package TreeNodes;

public class WhileBlock implements Node {
    private final Node condition;
    private final Node body;

    public WhileBlock(Node condition, Node body) {
        this.condition = condition;
        this.body = body;
    }
}
