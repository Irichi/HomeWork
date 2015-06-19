package homeWork08;

import java.util.Map;
import java.util.Stack;

/**
 * Created by Ксения on 15.06.2015.
 */
public class Print implements Cmd {
    @Override
    public void exec(Map<String, Double> vars, String[] params, Stack<Double> stack) {
        System.out.println(stack);
        System.out.println(vars);
    }
}
