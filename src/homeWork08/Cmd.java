package homeWork08;

import java.util.Map;
import java.util.Stack;

/**
 * Created by k.frolova on 15.06.15.
 */
public interface Cmd {
    void exec(Map<String, Double> vars, String params[], Stack<Double> stack);
}
