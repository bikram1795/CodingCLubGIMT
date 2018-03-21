package com.company;

import java.util.Scanner;


import java.io.*;
import java.util.*;

public class Array_2d {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        scan.close();
        sum(arr);
    }
    public static void sum(int[][] arr){
        int sum = -999;
        int newsum;
        for (int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                newsum=0;
                newsum+= arr[i-1][j-1];
                newsum+=arr[i-1][j];
                newsum+=arr[i-1][j+1];
                newsum+=arr[i][j];
                newsum+=arr[i+1][j-1];
                newsum+=arr[i+1][j];
                newsum+=arr[i+1][j+1];
                if (newsum>sum)
                {
                    sum=newsum;
                }
            }

        }
        System.out.println(sum);
    }
}

//public class Array_2d {
//    public static Scanner scan = new Scanner(System.in);
//    public static void main(String[] args){
//        int arr[][] = new int[6][6];
//        for (int i=0;i<6;i++){
//            for (int j=0;j<6;j++){
//                arr[i][j]=scan.nextInt();
//            }
//        }
//        sum(arr);
//    }
//    public static void sum(int[][] arr){
//        int sum = -999;
//        for (int i=0;i<=3;i++){
//            for (int j=0;j<=3;j++){
//                int first = arr[i][j]+arr[i][j+1]+arr[i][j+2];
//                int second = arr[i+1][j+1];
//                int last = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
//                int newsum = first+second+last;
//                if (newsum>sum)
//                {
//                    sum=newsum;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}
