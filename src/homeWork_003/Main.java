package homeWork_003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ксения on 17.05.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int x = 0;
        System.out.println("Введите значение коэффициента a: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите значение коэффициента b: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите значение коэффициента c: ");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Ваше уравнение:" + a + "x2+" + b + "x" + c);

        int d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Корней нет!");
        } else if (d == 0) {
            System.out.println("Только один корень: ");
            double x1 = (-b) / (2 * a);
            if (x1 < 0) {
                System.out.println("Корней нет!");
            } else {
                double x11 = Math.sqrt(x1);
                double x12 = -(Math.sqrt(x1));
                System.out.println("Первый корень = " + x11);
                System.out.println("Первый корень = " + x12);

            }

        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (x1 < 0) {
                System.out.println("У x1 корней нет!");
            } else {
                double x11 = Math.sqrt(x1);
                double x12 = -(Math.sqrt(x1));
                System.out.println("Первый корень = " + x11);
                System.out.println("Второй корень = " + x12);
            }
            if (x2 < 0) {
                System.out.println("У x2 корней нет!");
            } else {
                double x21 = Math.sqrt(x2);
                double x22 = -(Math.sqrt(x2));
                System.out.println("Третий корень = " + x21);
                System.out.println("Четвертый корень = " + x22);
            }
        }


    }
}
