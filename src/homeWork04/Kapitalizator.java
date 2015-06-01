package homeWork04;

/**
 * Created by Ксения on 01.06.2015.
 */
public class Kapitalizator {
    public static void main(String[] args) {
        String str = "СолнЫшко лось ЛуЧший!";

        kapit(str);

    }

    static void kapit(String str) {

        str = str.toLowerCase();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            str = str.replace(words[i].charAt(0), Character.toUpperCase(words[i].charAt(0)));
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");


        }
    }
}
