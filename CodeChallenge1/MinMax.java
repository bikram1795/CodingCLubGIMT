package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMax {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long sum = 0;

        for (int i = 0 ; i < arr.length ; i++){
            long temp = in.nextLong();
            arr[i] = temp;
            sum = sum+temp;
        }

        Arrays.sort(arr);
        long min = (sum - arr[arr.length-1]);
        long max = (sum - arr[0]);
        System.out.println(min +" " + max);

    }
}
