package com.miscellaneous.Arrays;

public class SubarrayProductLessThanK {
    public static long countSubArrayProductLessThanK(long a[], int n, long k)
    {
        long i=0;
        long j=0;
        long p=1;
        long c=0;
        while(i<n){
            if(j>=n){
                i++;
                j=i;
                p=1;
            }else {
                p *= a[(int) j];
                if (p < k) {
                    c++;
                    j++;
                } else {
                    p = 1;
                    i++;
                    j = i;
                }
            }
        }
        return c;
    }
}
