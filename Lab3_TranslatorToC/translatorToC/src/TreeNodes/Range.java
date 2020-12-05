package TreeNodes;

public class Range implements Node {
    private final int leftLimit;
    private final int rightLimit;

    public Range(int leftLimit, int rightLimit) {
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }
}
