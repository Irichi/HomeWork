package ru.geekbrains.tasks.homeWork007;

/**
 * Created by k.frolova on 29.05.15.
 */
public class Vocabulary {
    String[] voc = new String[]{"арбуз", "ассоциация", "бабушка", "голова", "дерево"};

    public static void main(String[] args) {
        String s = "Бавушка съела орбуз дар";
        String[] words = s.split(" ");
        Vocabulary vocab = new Vocabulary();
        for (int i = 0; i < words.length; i++) {
            String str = vocab.search(words[i]);
            words[i] = str;
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        //System.out.println(Arrays.toString(words));
    }

    public String search(String s) {
        int count = 0;
        int index = 0;
        String s1 = s;
        s = s.toLowerCase();
        for (int i = 0; i < voc.length; i++) {

            if (voc[i].length() == s.length()) {
                for (int j = 0; j < voc[i].length(); j++) {
                    char chVoc = voc[i].charAt(j);

                    if (chVoc == s.charAt(j)) {
                        //System.out.println( "equals " );
                        if (j == voc[i].length() - 1) {

                            s = s1.replace(s.charAt(index), voc[i].charAt(index));

                        }

                    } else {
                        // System.out.println( "not equals " );
                        if (count == 1) {
                            count = 0;

                            break;

                        } else {
                            index = j;
                            count += 1;
                        }

                    }

                }
            }
            }
        return s;
    }
}