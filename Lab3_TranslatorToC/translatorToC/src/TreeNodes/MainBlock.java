package TreeNodes;

public class MainBlock extends NodeClass implements Node {
    private final MainSubBlock subBlock;
    private final MainBlock mainBlock;

    public MainBlock(MainSubBlock subBlock, MainBlock mainBlock) {
        this.subBlock = subBlock;
        this.mainBlock = mainBlock;
    }

    public String toString(int padding) {
        String result = "";

        result += subBlock.toString(padding);
        if(mainBlock != null) {
            result += mainBlock.toString(padding);
        }

        return result;
    }
}
