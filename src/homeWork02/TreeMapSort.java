package homeWork02;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Ксения on 30.05.2015.
 */
public class TreeMapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 1, 5, 5, 6, 1, 2, 3, 2, 3, 5, 5};
        treeMapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] treeMapSort(int[] arr) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {

            if (treeMap.containsKey(arr[i])) {
                treeMap.put(arr[i], treeMap.get(arr[i]) + 1);
            } else {
                treeMap.put(arr[i], 1);
            }
        }
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                arr[count++] = entry.getKey();
            }
        }
//        int treeMapSize = treeMap.size();
//        for (int i = 0; i < treeMapSize; i++) {
//            for (int j = 0; j < treeMap.get(treeMap.firstKey()); j++) {
//                arr[count++] = treeMap.firstKey();
//            }
//            treeMap.remove(treeMap.firstKey());
//        }
        System.out.println(treeMap);
        return arr;
    }
}
