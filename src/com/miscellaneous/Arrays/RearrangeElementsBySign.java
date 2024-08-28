package com.miscellaneous.Arrays;

public class RearrangeElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int mid=(nums.length)/2;
        int[] pi=new int[mid];
        int[] ni=new int[mid];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pi[p]=nums[i];
                p++;
            } else if(nums[i]<0){
                ni[n]=nums[i];
                n++;
            }
        }
        p=0;
        int k=0;
        while(p<mid){
            nums[k]=pi[p];
            nums[k+1]=ni[p];
            k+=2;
            p+=1;
        }
        return nums;
    }
}
