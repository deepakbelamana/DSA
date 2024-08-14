package com.miscellaneous;

import java.util.ArrayList;

public class pascalTriangle {
    public ArrayList<Long> nthRowOfPascalTriangle(int n) {
        int[] a1 = new int[n+1];
        int[] a2 = new int[n+1];
        int mod = 1000000007;
        a1[0]=1;
        a2[0]=a2[1]=1;
        for(int i=3;i<=n;i++){
            if(i%2==0){
                for(int j=1;j<i-1;j++){
                    a2[j]=(a1[j-1]+a1[j])%mod;
                }
                a2[i-1]=1;
            }
            else{
                for(int j=1;j<i-1;j++){
                    a1[j]=(a2[j-1]+a2[j])%mod;
                }
                a1[i-1]=1;
            }
        }
        ArrayList<Long> res = new ArrayList<Long>();
        if(n%2==0){
            for(int i : a2){
                res.add((long)i);
            }
        }else{
            for(int i: a1){
                res.add((long)i);
            }
        }
        res.remove(res.size()-1);
        return res;
    }
}
