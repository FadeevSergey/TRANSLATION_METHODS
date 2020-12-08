package TreeNodes;

public class MainSubBlock extends NodeClass implements Node {
    private final Node block;

    public MainSubBlock(Node block) {
        this.block = block;
    }

    public String toString(int padding) {
        return block.toString(padding);
    }
}
