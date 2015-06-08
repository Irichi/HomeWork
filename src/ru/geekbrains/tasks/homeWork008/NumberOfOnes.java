package ru.geekbrains.tasks.homeWork008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by k.frolova on 27.05.15.
 */
public class NumberOfOnes {
    static int countOnes = 0;

    public static void main(String[] args) throws IOException {
        NumberOfOnes num = new NumberOfOnes();
        int result = num.counter();
        System.out.println("Number of ones in binary representation: " + result);

    }

    public int counter() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number");
        int number = Integer.parseInt(reader.readLine());
        String result = Integer.toBinaryString(number);
        System.out.println(result);
        for (int i = 0; i < result.length(); i++) {
            countOnes += Character.getNumericValue(result.charAt(i)) == 1 ? 1 : 0;

        }
        return countOnes;

    }
}

