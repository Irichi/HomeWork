package ru.geekbrains.tasks.homeWork05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Ксения on 08.06.2015.
 */
public class RleStream {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\tasks\\homeWork05\\1.txt");


        try (BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\ru\\geekbrains\\tasks\\homeWork05\\1.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                str = RleArchivator.archivate(str);
                System.out.println(str);
                System.out.println(RleArchivator.dearchivate(str));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
