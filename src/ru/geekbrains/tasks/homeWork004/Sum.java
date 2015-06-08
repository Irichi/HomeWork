package ru.geekbrains.tasks.homeWork004;

/**
 * Created by Иричи on 23.05.2015.
 */
public class Sum {
    public static void main(String[] args) {
        String a = "999";
        String b = "9999";
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        String sum = "";
        int alength = a.length();//длина строки  a
        int blength = b.length();//длина строки  b
        int ed = 0; // перенос единицы если число больше 9
        if (alength > blength) {
            for (int i = a.length() - 1; i >= 0; i--) {// цикл от длины а справа налево
                int aChar = Integer.parseInt(String.valueOf(a.charAt(i)));
                int result;
                if ((i + blength - alength) >= 0) {//мы еще не прошли по всем симолам строки б
                    int bChar = Integer.parseInt(String.valueOf(b.charAt(i + b.length() - a.length())));
                    result = aChar + bChar;
                } else {
                    result = aChar;
                }
                if (result > 9 && i > 0) {
                    result = result - 10;
                    sum = (result + ed) + sum;
                    ed = 1;
                    //     System.out.println(sum);
                } else {
                    sum = (result + ed) + sum;
                }
                System.out.println(sum);

            }
        }
    }
}
