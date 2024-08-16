package com.miscellaneous.sorting;

public class BubbleClass {
    public static void bubbleSort(int a[], int n)
    {
        for(int i=0;i<n;i++){
            //if the elements are sorted , then no swaps , break the loop
            boolean swap=false;
            for(int j=0;j<n-1-i;j++){
                if(a[j+1]<a[j]){
                    swap=true;
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
            if(!swap){
                break;
            }
        }
        for(int i: a){
            System.out.print(i);
        }
    }
}
