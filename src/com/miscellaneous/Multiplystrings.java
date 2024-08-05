package com.miscellaneous;

public class Multiplystrings {

    public String multiplyStrings(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        int [] ans = new int[n+m];
        int[] pro = new int[n+m];
        int carry=0;
        int shift;
        String a="";
        int l;
        for(int j=m-1;j>=0;j--){
            shift=m-j-1;
            carry=0;
            int sum=0;
            if(s2.charAt(j)=='-'){
                break;
            }

            for(int pr=0;pr<n+m;pr++){
                pro[pr]=0;
            }
            l=n+m-shift-1;
            for(int i=n-1;i>=0;i--){
                if(s1.charAt(i)=='-'){
                    break;
                }
                int prod=((int)s1.charAt(i)-48)*((int)s2.charAt(j)-48);
                prod=prod+carry;
                if(prod>=10){
                    carry=prod/10;
                    prod=prod%10;
                    sum=prod;
                }else {
                    sum=prod;
                    carry=0;
                }
                pro[l]=sum;
                l--;
            }
            if(carry!=0){
                pro[l]=carry;
            }
            carry=0;
            for(int k=n+m-1;k>=0;k--){
                int fsum=ans[k]+pro[k]+carry;
                if(fsum>=10){
                    carry=fsum/10;
                    fsum%=10;
                    ans[k]=fsum;
                }else{
                    ans[k]=fsum;
                    carry=0;
                }
                ans[k]=fsum;
            }
            if(carry!=0){
                int ck=0;
                for(;ck<n+m;ck++){
                    if(ans[ck]!=0){
                        break;
                    }
                }
                ans[ck--]=carry;
            }
        }
        int i=0;
       for(;i<m+n;i++){
           if(ans[i]==0){
           }else{
               break;
           }
       }
       if(i>=m+n){
           return "0";
       }
        if(s1.charAt(0)=='-' && s2.charAt(0)!='-'){
            a+='-';
        }
        if(s1.charAt(0)!='-' && s2.charAt(0)=='-'){
            a+='-' ;
        }
        for(;i<n+m;i++){
            a+=(char)(ans[i]+48);
        }
        return a;
    }
}
