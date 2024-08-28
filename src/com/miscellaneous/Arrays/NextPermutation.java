package com.miscellaneous.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind != -1) {
            for (int i = n - 1;i>ind; i--) {
                if (nums[i] > nums[ind]) {
                    int temp = nums[ind];
                    nums[ind] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        int i = ind + 1;
        int j = n - 1;
        while (i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }
}
