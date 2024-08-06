package com.miscellaneous;

import java.util.Arrays;

public class singleNumber {
    public int singleNumber(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(i==nums.length-1){
                res=nums[i];
                break;
            }
            if(nums[i]!=nums[i+1]){
                res=nums[i];
                break;
            }
        }
        return res;
    }
}
