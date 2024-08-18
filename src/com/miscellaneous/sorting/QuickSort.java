package com.miscellaneous.sorting;

public class QuickSort {
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pvt = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pvt && i<=high-1){
                i++;
            }
            while(arr[j]>=pvt && j>=low+1){
                j--;
            }
            if(i<j){
                int tem = arr[j];
                arr[j]=arr[i];
                arr[i]=tem;
            }

        }
        arr[low]=arr[j];
        arr[j]=pvt;
        return j;
    }
}
