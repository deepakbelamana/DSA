package com.miscellaneous;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        int last=0;
        int l=digits.length-1;
        int[] result;
        if(digits[l]!=9) {
            digits[l]=digits[l]+1;
            return digits;
        }else{
            last=digits[l]+1;
            while(last>9 && l>=0){
                digits[l]=0;
                l--;
                if(l>=0){
                    last=digits[l]+1;
                }
            }
        }
        if(l>0){
            return digits;
        } else{
            result=new int[digits.length+1];
            result[0]=1;
            for(int i=1;i<result.length;i++){
                result[i]=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        plusOne(new int[]{9});
    }
}
