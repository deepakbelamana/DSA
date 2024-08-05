package com.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] a = new int[]{ 24,18, 38, 43 ,14 ,40 ,1 ,54};
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            while(j>-1 && a[j]>a[j+1]){
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                j--;
            }
        }
        for(int k: a)
        {
            System.out.println(k);
        }
    }

}
