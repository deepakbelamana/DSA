package com.miscellaneous.BinarySearch;

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int left=0;
        int right=0;
        int ari=0;
        double res=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]<=nums2[right]){
                arr[ari]=nums1[left];
                left++;
                ari++;
            }else if(nums2[right]<=nums1[left]){
                arr[ari]=nums2[right];
                right++;
                ari++;
            }
        }
        while(left<nums1.length){
            arr[ari]=nums1[left];
            left++;
            ari++;
        }
        while(right<nums2.length){
            arr[ari]=nums2[right];
            right++;
            ari++;
        }
        if((arr.length-1)%2==0){
            res=arr[(arr.length-1)/2];
        } else{
            res=(arr[(arr.length-1)/2]+arr[((arr.length-1)/2)+1]);
            res/=2;
        }
        return res;
    }
}
