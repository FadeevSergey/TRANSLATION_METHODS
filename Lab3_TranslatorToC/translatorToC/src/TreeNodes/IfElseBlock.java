package TreeNodes;

public class IfElseBlock implements Node {
    private final Node condition;
    private final Node ifBlock;
    private final Node elseBlock;

    public IfElseBlock(Node condition, Node ifBlock, Node elseBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }
}
