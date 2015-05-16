package homeWork_001;

/**
 * Created by Иричи on 16.05.2015.
 */
public class Methods {
    public int[] coup(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int f = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = f;
            }

        }
        return arr;

    }

}
