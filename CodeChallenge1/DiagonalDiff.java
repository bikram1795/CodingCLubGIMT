package com.company;

import java.io.*;
import java.util.Scanner;

public class DiagonalDiff {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = scan.nextInt();

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = scan.nextInt();
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);
        System.out.println(result);

        scan.close();

    }

    private static int diagonalDifference(int[][] a) {
        int diff = 0;
        int sum1 = 0;
        int sum2 = 0;
        int n = a.length;
        for (int i = 0, j = n - 1; i < n; ++i, j --){
            sum1 += a[i][i];
            sum2 += a[i][j];
        }
        diff = sum1 - sum2;
        if (diff<0){
            return -diff;
        }
        else {
            return diff;
        }

    }

}
