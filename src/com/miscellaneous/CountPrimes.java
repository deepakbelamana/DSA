package com.miscellaneous;

public class CountPrimes {
    public static int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        boolean[] sve = new boolean[n+1];
        int count=0;
        for(int i=2;i<=n;i++){
            sve[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(sve[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    if(sve[j]!=false && j!=n){
                        count++;
                    }
                    sve[j]=false;
                }
            }
        }
        System.out.print(count+" "+sve[n]);
        n=n-2;
        return n-count;

    }
}
