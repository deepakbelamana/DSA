package com.miscellaneous.Arrays;

import java.util.Arrays;

public class MinimumSum {
    public static String solve(int[] arr, int n) {
        String s1="";
        String s2="";
        String res="";
        Arrays.sort(arr);
        int carry=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                s1=s1+(char)(arr[i]+48);
            } else {
                s2=s2+(char)(arr[i]+48);
            }
        }
        int i=s1.length()-1;
        int j= s2.length()-1;
        while(i>=0 && j>=0){
            int d1=s1.charAt(i)-'0';
            int d2=s2.charAt(j)-'0';
            int sum=(d1+d2+carry)%10;
            carry=(d1+d2+carry)/10;
            res=(char)(sum+48)+res;
            i--;
            j--;
        }
        while(i>=0){
            if(carry!=0){
                res=(char)(s1.charAt(i)-'0'+carry+48)+res;
                carry=0;
            }
            else {
                res=s1.charAt(i)+res;
            }
            i--;
        }
        while(j>=0){
            if(carry!=0){
                res=(char)(s2.charAt(j)-'0'+carry+48)+res;
                carry=0;
            }
            else {
                res=s2.charAt(j)+res;
            }
            j--;
        }
        if(carry!=0){
            res=(char)(carry+48)+res;
        }
        int k=0;
        while(k<res.length()){
            if(res.charAt(k)!='0'){
                return res.substring(k);
            }
            k++;
        }
        return "0";
    }
}
