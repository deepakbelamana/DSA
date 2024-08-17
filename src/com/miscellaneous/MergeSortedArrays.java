package com.miscellaneous;
import java.util.ArrayList;
import java.util.List;
public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        int l=0;
        int h=m+n-1;
        int mid=(l+h)/2;
        int left=0;
        int right=mid+1;
        while(left<=mid && right<=h){
            if(nums1[left]<nums1[right]){
                li.add(nums1[left]);
                left++;
            }else{
                li.add(nums1[right]);
                right++;
            }
        }
        while(left<=mid){
            li.add(nums1[left]);
            left++;
        }
        while(right<=h){
            li.add(nums1[right]);
            right++;
        }
        for(int i=l;i<=h;i++){
            nums1[i]=li.get(i-l);
        }
    }
}
