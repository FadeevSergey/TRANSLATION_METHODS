package TreeNodes;

public class IfBlock implements Node {
    private final Node ifOrIfElseBlock;

    public IfBlock(Node block) {
        this.ifOrIfElseBlock = block;
    }
}
