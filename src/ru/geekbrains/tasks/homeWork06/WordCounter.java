package ru.geekbrains.tasks.homeWork06;

import java.util.*;

/**
 * Created by Ксения on 09.06.2015.
 */
public class WordCounter {
    public static void main(String[] args) {
        String str = "Мама мыла раму. Мама. мыла дом. Мама работала дома.";
        wordCount(str);
    }

    static void wordCount(String str) {

        String str1 = str.replaceAll("\\p{Punct}", "").toLowerCase();
        String[] s = str1.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if (hashMap.containsKey(s[i])) {
                hashMap.put(s[i], hashMap.get(s[i]) + 1);
            } else {
                hashMap.put(s[i], 1);
            }
        }
        List entries = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
                }
        );
        //  System.out.println(hashMap);
        System.out.println(entries);
    }
}
