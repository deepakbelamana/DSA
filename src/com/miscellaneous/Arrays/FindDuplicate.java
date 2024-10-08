package com.miscellaneous.Arrays;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        //floyds cycle detection algorithm
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        fast = nums[0];

        while(slow!=fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
