import java.io.*;
import java.nio.charset.StandardCharsets;

import TreeNodes.Node;
import gen.ExpressionLexer;
import gen.ExpressionParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/tests/in/Test" + i + ".txt"), StandardCharsets.UTF_8))) {
                StringBuilder inputExpression = new StringBuilder();
                while (reader.ready()) {
                    inputExpression.append(reader.readLine()).append('\n');
                }
                CommonTokenStream tokens = new CommonTokenStream(
                        new ExpressionLexer(CharStreams.fromString(inputExpression.toString())));
                Node tree = new ExpressionParser(tokens).program().node;
                try (PrintWriter out = new PrintWriter("src/tests/out/Test" + i + ".c", StandardCharsets.UTF_8)) {
                    out.println(tree.toString(0));
                } catch (IOException e) {
                    System.err.println("IOException. Writer: " + e.getMessage());
                }
            } catch (IOException e) {
                System.err.println("IOException. Reader: " + e.getMessage());
            }
        }
    }
}