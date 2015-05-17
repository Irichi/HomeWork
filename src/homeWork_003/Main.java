package homeWork_003;

/**
 * Created by Ксения on 17.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 2;
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
            }

        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (x1 < 0) {
                System.out.println("Корней нет!");
            } else {
                double x11 = Math.sqrt(x1);
                double x12 = -(Math.sqrt(x1));
            }
            if (x2 < 0) {
                System.out.println("Корней нет!");
            } else {
                double x21 = Math.sqrt(x1);
                double x22 = -(Math.sqrt(x1));
            }
        }


    }
}
