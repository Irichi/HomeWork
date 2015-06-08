package ru.geekbrains.tasks.homeWork05;

/**
 * Created by Ксения on 08.06.2015.
 */
public class RleArchivator {


    static String archivate(String s) {
        char ch[] = s.toCharArray();
        String str = "";
        int counter = 1;
        for (int i = 0; i < ch.length - 1; i++) {


            if (ch[i] == ch[i + 1]) {
                counter++;

            } else {
                str += "" + ch[i] + counter;
                counter = 1;
            }
            if (i == ch.length - 2) {
                str += "" + ch[i + 1] + counter;
                //System.out.print(str);
                //System.out.println(" ");
            }
        }

        return str;
    }

    static String dearchivate(String s) {
        char ch[] = s.toCharArray();
        String str = "";
        for (int i = 0; i < ch.length - 1; i += 2) {
            for (int j = 0; j < Character.getNumericValue(ch[i + 1]); j++) {
                str += ch[i];
            }
        }
        //System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        String str = "ТТТТТТТТУУУУУУУТТТТТТТОО ";
        System.out.println(dearchivate(archivate(str)));
    }
}
