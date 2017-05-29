package com.company;

/**
 * Created by User on 5/29/2017.
 */
public class Calc {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 0; i < args.length ; i++) {
     int c = Integer.parseInt(args[i]);
        a = a + c;
        b = b * c;
        }
        System.out.println("Sum = " + a);
        System.out.println("Mult = " + b);
    }
}
