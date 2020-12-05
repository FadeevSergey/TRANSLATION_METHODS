package TreeNodes;

public class MainBlock implements Node {
    private final MainSubBlock subBlock;
    private final MainBlock mainBlock;

    public MainBlock(MainSubBlock subBlock, MainBlock mainBlock) {
        this.subBlock = subBlock;
        this.mainBlock = mainBlock;
    }
}
