package homeWork08;

import java.util.Map;
import java.util.Stack;

/**
 * Created by k.frolova on 15.06.15.
 */
public class Push implements Cmd {
    public void exec(Map<String, Double> vars, String params[], Stack<Double> stack) {
        if (vars.containsKey(params[1])) {
            stack.push(vars.get(params[1]));
        } else {

            try {
                stack.push(Double.parseDouble(params[1]));
            } catch (NumberFormatException e) {
                System.out.println("Нет такой переменной в Map!");
            }

            System.out.println(stack);
        }
    }
}
