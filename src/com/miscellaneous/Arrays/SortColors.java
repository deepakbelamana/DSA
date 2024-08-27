package com.miscellaneous.Arrays;

public class SortColors {
    public int [] sortColors(int[] nums) {
       /* int z=0;
        int o=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            } else if(nums[i]==1){
                o++;
            } else{
                t++;
            }
        }
        int i=0;
        while(i<z){
            nums[i]=0;
            i++;
        }
        while(i<z+o){
            nums[i]=1;
            i++;
        }
        while(i<z+o+t){
            nums[i]=2;
            i++;
        }*/
        /*
         ==============
         ducth national flag algorithm
         */
       int mid=0;
        int low=0;
        int high=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            } else if(nums[mid]==1){
                mid++;
            } else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
        return nums;
    }
}
