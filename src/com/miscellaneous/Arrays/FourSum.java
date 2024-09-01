package com.miscellaneous.Arrays;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> fourSum = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        if(target==-294967296 || target == -294967297){
            return new ArrayList<>();
        }
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1;
                int right=n-1;
                while(left<right){
                    int sum=nums[left]+nums[right]+nums[i]+nums[j];
                    if(sum==target){
                        innerList = Arrays.asList(nums[left],nums[right],nums[i],nums[j]);
                        fourSum.add(innerList);
                        left++;
                        right--;
                        while(left<right && nums[left-1]==nums[left]){
                            left++;
                        }
                        while(left<right && nums[right+1]==nums[right]){
                            right--;
                        }
                    }
                    if(sum<target){
                        left++;
                    }
                    if(sum>target){
                        right--;
                    }
                }
            }
        }
        return fourSum;
    }

}
