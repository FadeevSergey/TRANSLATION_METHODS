package TreeNodes;

public class Range extends NodeClass implements Node {
//    private final MatExpression leftLimit;
//    private final MatExpression rightLimit;
//
//    public Range(MatExpression leftLimit, MatExpression rightLimit) {
//        this.leftLimit = leftLimit;
//        this.rightLimit = rightLimit;
//    }

    private final MathExpression leftLimit;
    private final MathExpression rightLimit;

    public Range(MathExpression leftLimit, MathExpression rightLimit) {
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    public MathExpression getLeft() {
        return leftLimit;
    }

    public MathExpression getRight() {
        return rightLimit;
    }

    public String toString(int padding) {
        return "moc range";
    }
}
