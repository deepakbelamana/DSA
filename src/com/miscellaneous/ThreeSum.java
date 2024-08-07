package com.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>sl=new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++)
        {
            //if it is not the first element and if it is equal to
            // previous element , that means i-1 is already checked in
            //before iteration , hence continue
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            int target = 0-nums[i];
            while(j<k)
            {
                int sum =nums[k]+nums[j];
                if(sum==target)
                {

                    sl= Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(sl);
                    //one i , may contain multiple triplets
                    //hence increment and decrement
                    j++;
                    k--;
                    /**
                     if j == j-1 it means j-1 is already checked in previous
                     iteration, hence no need to check to avoid duplicates
                     same for k.
                     */
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;

                }
                else if(sum<target)
                {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return res;
    }
}

