package homeWork08;
// todo положить java файлы в папки, соответствующие пакетам
// todo хранить все команды в Map<String,Cmd>

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.TreeMap;

/**
 * Created by k.frolova on 15.06.15.
 */
public class Start {
    public static void main(String[] args) throws IOException {
        String str = " ";
        Stack<Double> stack = new Stack<Double>();
        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        TreeMap<String, Cmd> stringCmdTreeMap = new TreeMap<>();
        stringCmdTreeMap.put("pop", new Pop());
        stringCmdTreeMap.put("push", new Push());
        stringCmdTreeMap.put("add", new Add());
        stringCmdTreeMap.put("define", new Define());
        stringCmdTreeMap.put("mul", new Mul());
        stringCmdTreeMap.put("div", new Div());
        stringCmdTreeMap.put("exit", new Exit());
        stringCmdTreeMap.put("print", new Print());

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                str = reader.readLine();
                str = str.toLowerCase();
                String s[] = str.split(" ");
                Cmd cmd = stringCmdTreeMap.get(s[0]);

                try {
                    cmd.exec(tm, s, stack);
                } catch (Exception e) {
                    System.out.println("Неправильно введены данные!");
                }

                /*Cmd cmd=null;
                if ("pop".equals(s[0])) {
                     cmd = new Pop();
                } else if ("push".equals(s[0])) {
                    cmd = new Push();
                }
                else if ("add".equals(s[0])) {
                    cmd = new Add();
                }
                else if ("mul".equals(s[0])) {
                    cmd = new Mul();
                }
                else if ("div".equals(s[0])) {
                    cmd = new Div();
                }
                else if ("define".equals(s[0])) {
                    cmd = new Define();
                }else if ("print".equals(s[0])) {
                    cmd = new Print();
                }else if ("exit".equals(s[0])) {
                    cmd = new Exit();
                }else {
                    System.out.println("Введите корректную команду!");

                }
          if(cmd!=null) cmd.exec(tm,s,stack);

*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}