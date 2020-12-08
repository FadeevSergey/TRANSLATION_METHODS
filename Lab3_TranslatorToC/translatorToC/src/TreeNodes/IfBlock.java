package TreeNodes;

public class IfBlock extends NodeClass implements Node {
    private final Node ifOrIfElseBlock;

    public IfBlock(Node block) {
        this.ifOrIfElseBlock = block;
    }

    public String toString(int padding) {
        return ifOrIfElseBlock.toString(padding);
    }
}
