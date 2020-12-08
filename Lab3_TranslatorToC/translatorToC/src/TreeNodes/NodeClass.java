package TreeNodes;

import java.util.Collections;

public abstract class NodeClass implements Node {
    protected String getPadding(int n) {
        return String.join("", Collections.nCopies(n, "    "));
    }
}
