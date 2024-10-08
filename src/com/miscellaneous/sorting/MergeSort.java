package com.miscellaneous.sorting;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    static void  merge(int arr[], int l, int m, int r)
    {
        List<Integer> temp = new ArrayList<Integer>();
        int left=l;
        int right=m+1;
        while(left<=m && right<=r){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=m){
            temp.add(arr[left]);
            left++;
        }
        while(right<=r){
            temp.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=temp.get(i-l);
        }

    }
    public static void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
