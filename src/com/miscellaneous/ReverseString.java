package com.miscellaneous;

public class ReverseString {
    public static String reverseWords(String s) {
        s=s.trim();
        int j=s.length()-1;
        String result="";
        int _sp=Integer.MAX_VALUE;
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i) != ' '){
                if(_sp<i) {
                    j=i;
                    _sp=i;
                }
                continue;
            }
            if(s.charAt(i) == ' '|| i==0) {
                if(_sp>=i) {
                    _sp=i;
                }
                if(_sp==i){
                    result=result+s.substring(i+1,j+1)+" ";
                    _sp=Integer.MIN_VALUE;
                }
            }
        }
        result=result+s.substring(0,j+1)+" ";
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
