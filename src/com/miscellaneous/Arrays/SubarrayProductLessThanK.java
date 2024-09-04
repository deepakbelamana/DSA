package com.miscellaneous.Arrays;

public class SubarrayProductLessThanK {
    public static long countSubArrayProductLessThanK(long nums[], int n, long k)
    {
        long left=0;
        long right=0;
        long product=1;
        long count=0;
        while(right<n){
            product*=nums[(int)right];
            while(left<=right && product>=k){
                product/=nums[(int)left];
                left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
}
