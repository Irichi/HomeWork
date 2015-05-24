package homeWork005;

import java.util.Arrays;

/**
 * Created by Иричи on 24.05.2015.
 */
public class Sequence {
    public int k = 1;
    public int j = 0;

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        System.out.println(Arrays.toString(search(arr1)));

    }

    public static int[] search(int[] arr1) {
        int k = 1;
        int j = 0;
        int start = 0;
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max < arr1[i]) { // если следующее значение больше, чем предыдущее
                k++;  // увеличиваем счетчик последовательных элементов
                if (i == arr1.length - 1) { // если последнее значение массива - последний элемент посл-ти
                    if (k > j) {
                        j = k; // записываем макс последовательность
                        start = i - j + 1; // записываем начало посл-ти
                    }
                }

            } else {
                if (k > j) {
                    j = k;
                    start = i - k;

                }
                k = 1;

            }
            max = arr1[i];

        }

        return Arrays.copyOfRange(arr1, start, start + j); // возвращаем посл-ть с начала до послед элемента
    }
}
