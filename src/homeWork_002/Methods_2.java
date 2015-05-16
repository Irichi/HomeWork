package homeWork_002;

/**
 * Created by Иричи on 16.05.2015.
 */
public class Methods_2 {
    public double sred(int[] arr) {
        double d = 0;
        for (int i = 0; i < arr.length; i++) {
            d = d + arr[i];
        }
        double result = d / 2;
        return result;
    }

    public int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            } else max = arr[i];
        }
        return max;

    }
}
