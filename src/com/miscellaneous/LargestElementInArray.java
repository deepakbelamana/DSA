package com.miscellaneous;

public class LargestElementInArray {
    public static int largest(int n, int[] arr) {
        int lar=Integer.MIN_VALUE;
        if(n==1){
            return arr[0];
        }
        for(int i=0;i<n;i++){
            lar=Math.max(arr[i],lar);
        }
        return lar;
    }
}
