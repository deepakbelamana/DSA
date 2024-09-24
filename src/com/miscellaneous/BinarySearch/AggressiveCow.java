package com.miscellaneous.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int low=0;
        int n=stalls.length;
        int high=stalls[n-1]-stalls[0];
        int ans=stalls[n-1];
        while(low<=high){
            int mid=(low+high)/2;
            if(capable(stalls,mid,k)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean capable(int[] stalls,int mid,int k){
        int currC=stalls[0];
        int count=1;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-currC>=mid){
                count++;
                currC=stalls[i];
            }
        }
        if(count>=k){
            return true;
        }
        return false;
    }
}
