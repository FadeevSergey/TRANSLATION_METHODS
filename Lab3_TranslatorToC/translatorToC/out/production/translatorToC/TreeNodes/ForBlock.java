package TreeNodes;

public class ForBlock implements Node {
    private final Node var;
    private final Node range;
    private final Node body;

    public ForBlock(Node var, Node range, Node body) {
        this.var = var;
        this.range = range;
        this.body = body;
    }
}
