package TreeNodes;

public class Program extends NodeClass implements Node {
    private final Node mainBlock;

    public Program(Node mainBlock) {
        this.mainBlock = mainBlock;
    }

    public String toString(int padding) {
        String result = "#include <stdio.h>" + "\n" +
                "#include <stdbool.h>" + "\n" +
                "\n" +
                "int main()" + "\n" +
                "{\n" +
                mainBlock.toString(padding + 1) +
                "}\n";
        return result;
    }
}
