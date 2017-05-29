package com.company;

/**
 * Created by User on 5/28/2017.
 */
public class ArrayInverter {
public static  void invert(int [] args) {
    for (int k = 0; k < args.length / 2; k++) {
        int tmp = args[k];
        args[k] = args[args.length - k -1];
        args[args.length - k -1] = tmp;
    }

}
}
