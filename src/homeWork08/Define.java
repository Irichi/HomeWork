package homeWork08;

import java.util.Map;
import java.util.Stack;

/**
 * Created by Ксения on 15.06.2015.
 */
public class Define implements Cmd {
    @Override
    public void exec(Map<String, Double> vars, String[] params, Stack<Double> stack) {
        try {
            vars.put(params[1], Double.parseDouble(params[2]));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(vars);

    }

}
