package com.miscellaneous.Arrays;

public class MaximumSubarray {
    //kadanes algorithm
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
