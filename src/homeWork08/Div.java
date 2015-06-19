package homeWork08;

import java.util.Map;
import java.util.Stack;

/**
 * Created by Ксения on 15.06.2015.
 */
public class Div implements Cmd {
    @Override
    public void exec(Map<String, Double> vars, String[] params, Stack<Double> stack) {
        if (stack.empty()) {
            System.out.println("Стэк пустой");
        } else {
            stack.push(stack.pop() / (stack.empty() ? 1 : stack.pop()));
            System.out.println(stack);
        }
    }
}
