package com.miscellaneous.Arrays;

import java.util.Arrays;

public class MissingAndRepeating {
    public static int[] findTwoElement(int a[], int n) {
        Arrays.sort(a);
        // boolean repf=false;
        // int rep=0;
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<n-1;i++){
        //     if(a[i]!=a[i+1]){
        //         if(a[i+1]-a[i]>1){
        //             min=Math.min(min,a[i]+1);
        //         }
        //         if(a[i]==a[i+1] && !repf){
        //             repf=true;
        //             rep=a[i];
        //         }
        //     }
        // }
        int rep=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                rep=a[i];
                break;
            }
        }
        int min=0;
        int k=1;
        for(int i=0;i<n-1;i++,k++){
            if(a[i]!=k){
                min=k;
                break;
            }
        }
        int[] res=new int[]{rep,min};
        return res;
    }
}
