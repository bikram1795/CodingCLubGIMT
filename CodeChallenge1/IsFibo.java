package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class IsFibo {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        for (int i=0;i<n;i++)
        {
            BigInteger Case = stdin.nextBigInteger();
            System.out.print(isfibo(Case));
        }
        stdin.close();

    }


    public static String isfibo(BigInteger n) {

        BigInteger first = BigInteger.ZERO;
        BigInteger current =BigInteger.ONE;
        while(first.compareTo(n)<=0) {
            if (first.compareTo(n)==0){
                return "IsFibo";
            }
            BigInteger temp = first;
            first = current;
            current = current.add(temp);
        }
        return "IsNotFibo";
    }
}
