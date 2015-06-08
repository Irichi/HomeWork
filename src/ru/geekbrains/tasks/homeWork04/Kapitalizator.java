package ru.geekbrains.tasks.homeWork04;

/**
 * Created by Ксения on 01.06.2015.
 */
public class Kapitalizator {
    public static void main(String[] args) {
        String str = "СолнЫшко сАмЫЙ ЛуЧший!";
        String str1 = str.toLowerCase();
        str1 = " " + str1;
        kapit(str1);

    }

    static void kapit(String str) {
        char ch[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == ' ') {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);

            }
        }

        for (int i = 1; i < ch.length; i++) {
            System.out.print(ch[i]);
        }


    }
}

