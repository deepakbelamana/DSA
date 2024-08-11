package com.miscellaneous;

public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] a) {
//        int[] ar = new int[nums.length];
//        int k=0;
//        int ans=1;
//        ar[k]=nums[k];
//        for(int i:nums){
//            if(i!=ar[k]){
//                ar[k+1]=i;
//                k++;
//                ans++;
//            }
//        }
//        for(int i=0;i<ar.length;i++){
//            nums[i]=ar[i];
//        }
//        return ans;
        //two pointer approach
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                a[i+1]=a[j];
                i++;
            }
        }
        return i+1;
    }
}
