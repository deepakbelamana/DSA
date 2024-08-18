package com.miscellaneous.sorting;

import java.util.ArrayList;
import java.util.List;

public class CheckSortedAndRotated {
    public static boolean check(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            count++;
        }
        return count<=1;
    }
}
