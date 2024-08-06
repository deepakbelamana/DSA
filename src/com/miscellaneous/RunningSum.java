package com.miscellaneous;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int [] res = new int[nums.length];
        int rsum=0;
        for(int i=0;i<nums.length;i++){
            rsum+=nums[i];
            res[i]=rsum;
        }
        return res;
    }
}
