package com.miscellaneous.BinarySearch;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        //start and end are changed to avoid edge cases
        int start=1;
        int end=nums.length-2;
        int ans=-1;
        int n=nums.length;
        //checking for 1st number
        if(nums.length==1){
            return nums[0];
        }
        //checking for last number
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-2]!=nums[n-1]){
            return nums[n-1];
        }
        /**
         * observation:
         *      for [1,1,2,2,3,3,4,5,5,6,6]
         *      e,o,e,o,e,o ,4,o,e,o,e
         *      e and o are even and odd
         *      if even,odd indices are equal that means four/element lies in
         *      next half.
         *      if odd,even indices are equal that means four/element lies in
         *      before half.
         */
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                ans=nums[mid];
                break;
            }
            /*
               if even,odd indices are equal that means four/element lies in
                next half.
             */
            if((mid%2==0 && nums[mid+1]==nums[mid]) || (mid%2==1 &&
                    nums[mid-1]==nums[mid]) ){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
