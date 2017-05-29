package com.company;

import java.util.Arrays;

public class Task1 {


    public static void main(String[] args) {
        System.out.println("Hello !" + " " + Arrays.toString(args));
        arrayInvert(args);
        System.out.println(Arrays.toString(args));



    }

    private static void arrayInvert(String[] args) {
        for (int k = 0; k < args.length / 2; k++) {
            String tmp = args[k];
            args[k] = args[args.length - k -1];
            args[args.length - k -1] = tmp;
        }
    }


}

