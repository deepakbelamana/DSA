package com.miscellaneous;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int res=0;
         /*
         * using hash map
         *
         HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
         for(int i=0;i<nums.length;i++){
             hm.put(nums[i],1);
         }
         for(int i=0;i<=nums.length;i++){
             if(!hm.containsKey(i)){
                res=i;
                break;
             }
         }
         return res;
         *
         * */
        /**
         * using binary search
         */
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
            if(!binarySearch(i,nums)){
                res=i;
                break;
            }
        }
        return res;
    }

    public boolean binarySearch(int s, int[] n){
        int i=0;
        int j=n.length-1;
        boolean res=false;
        while(i<=j){
            int mid = (i+j)/2;
            if(s==n[mid]){
                return true;
            } else if(s>n[mid]){
                i=mid+1;
            } else{
                j=mid-1;
            }
        }
        return res;
    }
}
