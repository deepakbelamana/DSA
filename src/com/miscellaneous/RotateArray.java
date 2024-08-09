package com.miscellaneous;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        k%=nums.length;
        int n=nums.length;
        int ind = n-k;
        int i=ind;
        int j=n-1;

        while(i<j){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        i=0;
        j=ind-1;
        while(i<j){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        i=0;
        j=n-1;
        while(i<j){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        return nums;
    }

}
