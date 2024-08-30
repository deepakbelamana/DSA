package com.miscellaneous.Arrays;

import java.util.Arrays;

public class MissingAndRepeating {
    public static int[] findTwoElement(int a[], int n) {
        int[] refa=new int[n];
        int[]  res = new int[2];
        for(int i=0;i<n;i++){
            if(refa[a[i]-1]==0){
                refa[a[i]-1]=1;
            }else if(refa[a[i]-1]==1){
                refa[a[i]-1]+=1;
            }
        }
        int mis=0;
        int rep=0;
        for(int i=0;i<n;i++){
            if(refa[i]==0){
                mis=i+1;
            } else if(refa[i]>1){
                rep=i+1;
            }
        }
        res[0]=rep;
        res[1]=mis;
        return res;
    }
}
