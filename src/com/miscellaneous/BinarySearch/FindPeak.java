package com.miscellaneous.BinarySearch;

public class FindPeak {
    public int findPeakElement(int[] nums) {
        int start=1;
        int end=nums.length-2;
        int n=nums.length;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else if(nums[mid]<nums[mid-1]){
                end=mid-1;
            }
        }
        return -1;
    }
}
