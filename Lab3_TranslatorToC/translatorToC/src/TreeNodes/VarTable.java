package TreeNodes;

import java.util.HashMap;
import java.util.Map;

public class VarTable {
    private static Map<String, Types> table = new HashMap<>();

    public static void addVar(String varName, Types type) {
        if(!table.containsKey(varName)) {
            table.put(varName, type);
        } else {
            if(type != Types.Unknown) {
                table.put(varName, type);
            }
        }
    }

    public static Types getType(String varName) {
        return table.getOrDefault(varName, Types.Unknown);
    }
}