package homeWork_001;

import java.util.Arrays;

/**
 * Created by Иричи on 16.05.2015.
 */
public class Start {

    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int j = 0; j < arr.length; j++) {
            int k = (int) (Math.random() * 10);
            arr[j] = k;
        }
        System.out.println(Arrays.toString(arr));
        Methods meth = new Methods();
        int[] mas = meth.coup(arr);
        System.out.println(Arrays.toString(mas));
    }
}
