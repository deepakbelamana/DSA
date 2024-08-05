package com.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDivisors {
    public static void main(String[] args) {
        Solution.print_divisors(2);
    }
}

class Solution {
    public static void print_divisors(int n) {
        // code here
        int i=1;
        if(n==1){
            System.out.print(1);
            System.exit(0);
        }
        List<Integer> a = new ArrayList<Integer>();
        while(i*i<n){
            if(n%i==0){
                a.add(i);
                if(n/i!=i){
                    a.add(n/i);
                }
            }
            i++;
        }
        Collections.sort(a);
        for(int j=0;j<a.size();j++){
            System.out.print(a.get(j)+" ");
        }
    }
}


