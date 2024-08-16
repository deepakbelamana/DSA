package com.miscellaneous;

import java.util.HashMap;

public class SubArraysWithSumK {
    public static int subarraySum(int[] a, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int count=0;
        hm.put(0,1);
        int i=0;
        int prsm=0;
        while(i<a.length){
            prsm+=a[i];
            int rem = prsm-k;
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
            }
            if(hm.containsKey(prsm)){
                hm.put(prsm,hm.get(prsm)+1);
            } else{
                hm.put(prsm,1);
            }
            i++;
        }
        return count;
    }
    }
