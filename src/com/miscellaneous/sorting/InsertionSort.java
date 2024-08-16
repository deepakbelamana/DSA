package com.miscellaneous.sorting;

public class InsertionSort {
    public void insertionSort(int arr[], int n)
    {
        //take first element as sorted and then find the insert positions of next
        //upcoming elements
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j]; //shifting elements,to get the insert position
                }else{
                    break;
                }
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
