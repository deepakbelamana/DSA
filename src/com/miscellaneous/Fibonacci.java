package com.miscellaneous;

public class Fibonacci {
    public static void main (String[] args) throws java.lang.Exception
    {
        int num1 = 0, num2 = 1;
        int N = 5;
        for (int j = 0; j < N; j++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
}