package com.miscellaneous;

public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
        int[] ar = new int[nums.length];
        int k=0;
        int ans=1;
        ar[k]=nums[k];
        for(int i:nums){
            if(i!=ar[k]){
                ar[k+1]=i;
                k++;
                ans++;
            }
        }
        for(int i=0;i<ar.length;i++){
            nums[i]=ar[i];
        }
        return ans;
    }
}
