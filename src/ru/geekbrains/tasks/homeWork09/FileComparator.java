package ru.geekbrains.tasks.homeWork09;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Ксения on 15.06.2015.
 */
public class FileComparator {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Ксения\\IdeaProjects\\HomeWork\\src\\ru\\geekbrains\\tasks\\homeWork09\\1");
        File file2 = new File("C:\\Users\\Ксения\\IdeaProjects\\HomeWork\\src\\ru\\geekbrains\\tasks\\homeWork09\\2");
        try {
            System.out.println(compare(file, file2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long compare(File f1, File f2) throws Exception {
        long k = 0;
        if (f1.length() != f2.length()) {
            k = f1.length() - f2.length();
        } else {

            try (FileReader fileReader = new FileReader(f1); FileReader fileReader1 = new FileReader(f2)) {
                int aF1;
                int aF2;
                while (true) {
                    aF1 = fileReader.read();
                    aF2 = fileReader1.read();
                    if (aF1 == -1) {
                        break;
                    }
                    if (aF1 != aF2) {
                        k = aF1 - aF2;
                    } else {
                        continue;
                    }

                }
            } catch (IOException e) {
                throw new Exception();
            }
        }
        return k;
    }
}