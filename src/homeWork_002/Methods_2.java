package homeWork_002;

/**
 * Created by Иричи on 16.05.2015.
 */
public class Methods_2 {
    public double avg(int[] arr) {
        double d = 0;
        for (int i = 0; i < arr.length; i++) {
            d = d + arr[i];
        }
        double result = d / arr.length;
        return result;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }
}
