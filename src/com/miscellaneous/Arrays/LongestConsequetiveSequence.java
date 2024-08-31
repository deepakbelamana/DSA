package com.miscellaneous.Arrays;

import java.util.HashSet;

public class LongestConsequetiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs= new HashSet<Integer>();
        for(int i : nums){
            hs.add(i);
        }
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){
                int count=1;
                int se=nums[i];
                while(hs.contains(se+1)){
                    count+=1;
                    se+=1;
                }
                if(count>max){
                    max=count;
                }
            }
        }
        return max;
    }
}
