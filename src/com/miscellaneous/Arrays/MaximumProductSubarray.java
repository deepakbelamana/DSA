package com.miscellaneous.Arrays;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int i=0;
        int max=Integer.MIN_VALUE;
        int pref=1;
        int suff=1;
        while(i<nums.length){
            if(pref==0){
                pref=1;
            }
            if(suff==0){
                suff=1;
            }
            pref=pref*nums[i];
            suff=suff*nums[nums.length-i-1];
            max=Math.max(max,Math.max(pref,suff));
            i++;
        }
        return max;
    }
}
