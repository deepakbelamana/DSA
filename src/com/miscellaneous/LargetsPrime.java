package com.miscellaneous;

public class LargetsPrime {
    static long largestPrimeFactor(int N) {
        // code here
        long max=0;
        for(int i=1;i*i<=N;i++){
                if(N%i==0){
                    if(N/i!=i){
                        if(checkPrime(N/i)){
                            max=Math.max(max,N/i);
                        }
                    }
                    if(checkPrime(i)){
                        max=Math.max(max,i);
                    }
                }

        }
        return max;
    }
    static boolean checkPrime(int n){
        int j=1;
        if(n==1){
            return false;
        }
        int count=0;
        while(j*j<=n){
            if(n%j==0){
                count++;
                if(n/j!=j){
                    count++;
                }
            }
            if(count>2){
                return false;
            }
            j++;
        }
      return true;
    }
}
