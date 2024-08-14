package com.miscellaneous;

public class FibonaccieUptoN {
    int mod = 1000000007;
    int[] Series(int n) {
        //recursion
        //   int[] a = new int[n+1];
        //   for(int i=0;i<=n;i++){
        //       int fi=rec(i);
        //       a[i]=fi;
        //   }
        //   return a;
        // }
        // int rec(int n){
        //     if(n==0){
        //         return 0;
        //     }
        //     if(n==1){
        //         return 1;
        //     }
        //     return rec(n-1)+rec(n-2);

        //normal approach
        int[] a = new int[n+1];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=(a[i-1]+a[i-2])%mod;
        }
        return a;
    }
}
