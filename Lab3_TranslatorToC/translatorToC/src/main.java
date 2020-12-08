import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import TreeNodes.Node;
import gen.ExpressionLexer;
import gen.ExpressionParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputExpression = "" +
                    "let x = 5" + "\n" +
                    "var tempVar = 5 + 10 * 18 % (x - 15)" + "\n" +
                    "for i in range(1..x + 1) {" + "\n" +
                    "    var y = readInt()" + "\n" +
                    "    print(y)" + "\n" +
                    "}" + "\n" +
                    "print(-1 + x)" + "\n" +
                    "print(true || false && true)" + "\n" +
                    "var n = readInt()" +
                    "for i in range(1..x + 1) {" + "\n" +
                    "    let yy = readDouble()" + "\n" +
                    "    print(yy)" + "\n" +
                    "}" + "\n" +
                    "let xx = true" + "\n" +
                    "let z = false" + "\n" +
                    "print((xx || z) && (false || true))" + "\n" +
                    "let testScanConst = readDouble()" + "\n";
            CommonTokenStream tokens = new CommonTokenStream(
                    new ExpressionLexer(CharStreams.fromString(inputExpression)));
            Node tree = new ExpressionParser(tokens).program().node;
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println(inputExpression);
            System.out.println(tree.toString(0));
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}