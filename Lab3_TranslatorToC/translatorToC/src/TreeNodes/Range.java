package TreeNodes;

public class Range extends NodeClass implements Node {
//    private final MatExpression leftLimit;
//    private final MatExpression rightLimit;
//
//    public Range(MatExpression leftLimit, MatExpression rightLimit) {
//        this.leftLimit = leftLimit;
//        this.rightLimit = rightLimit;
//    }

    private final MatExpression leftLimit;
    private final MatExpression rightLimit;

    public Range(MatExpression leftLimit, MatExpression rightLimit) {
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    public MatExpression getLeft() {
        return leftLimit;
    }

    public MatExpression getRight() {
        return rightLimit;
    }

    public String toString(int padding) {
        return "moc range";
    }
}
