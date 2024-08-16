package com.miscellaneous.sorting;

public class SelectionSort {
    void selectionSort(int a[], int n)
    {
        for(int i=0;i<n-1;i++){
            int min=a[i];
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
