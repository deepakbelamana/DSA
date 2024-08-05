package com.miscellaneous;

import java.util.List;

public class SecondLargetElement {
    public int print2largest(List<Integer> arr) {
        int sl=Integer.MIN_VALUE;
        int fl=Integer.MIN_VALUE;
        for(int i : arr){
            if(i>fl){
                sl=fl;
                fl=i;
            }
            else{
                if(i>sl && i!=fl){
                    sl=i;
                }
            }
        }
        if(fl==sl || sl==Integer.MIN_VALUE) {
            return -1;
        }
        return sl;
    }
}
