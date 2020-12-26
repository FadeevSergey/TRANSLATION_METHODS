package TreeNodes;

public class IfElseBlock extends NodeClass implements Node {
    private final String condition;
    private final Node ifBlock;
    private final Node elseBlock;

    public IfElseBlock(String condition, Node ifBlock, Node elseBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    public String getCondition() {
        return condition;
    }

    public String toString(int padding) {
        return getPadding(padding) + "if(" + condition + ")" + "\n" +
                getPadding(padding) + "{" + "\n" +
                ifBlock.toString(padding + 1) +
                getPadding(padding) + "}" + "\n" +
                getPadding(padding) + "else" + "\n" +
                getPadding(padding) + "{" + "\n" +
                elseBlock.toString(padding + 1) +
                getPadding(padding) + "}" + "\n";
    }
}
