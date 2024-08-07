package com.miscellaneous;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j=-1;
        //check first occurence of zero
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        //modify only if zero exists
        if(j!=-1){
            for(int i=j+1;i<nums.length;i++){
                if(nums[i]!=0){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    j++;
                }
            }
        }

    }
}
