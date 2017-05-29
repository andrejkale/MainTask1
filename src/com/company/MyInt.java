package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by User on 5/29/2017.
 */
public class MyInt {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<Integer>();
        String number1;

        for (int i = 0; i < 6; i++) {
            num.add(Integer.parseInt(reader.readLine()));

        }

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                System.out.println("Even number " + " " + num.get(i));
            } else {
                System.out.println("Odd number " + " " + num.get(i));
            }
        }
        int max = num.get(0);
        int min = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            int number = num.get(i);
            if (number > max) max = number;
            if (number < min) min = number;

        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 3 == 0) {
                System.out.println("Divide on 3 " + num.get(i));
            }
            if (num.get(i) % 9 == 0) {
                System.out.println("Divide on 9 " + num.get(i));
            }
            if (num.get(i) % 5 == 0) {
                System.out.println("Divide on 5 " + num.get(i));
            }
            if (num.get(i) % 7 == 0) {
                System.out.println("Divide on 7 " + num.get(i));
            }

        }
        for (int i = 0; i < num.size(); i++) {
            number1 = num.get(i).toString();
            if (number1.length() == 3 && number1.charAt(0) != number1.charAt(1) && number1.charAt(1) != number1.charAt(2) && number1.charAt(0) != number1.charAt(2)) {
                System.out.println("Numbers with three different digits " + num.get(i));
            }

        }


    }
}

