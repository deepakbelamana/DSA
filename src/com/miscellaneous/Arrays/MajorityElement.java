package com.miscellaneous.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        //moore voting algorithm
        int count = 0;
        int el = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                el = nums[i];
                count = 1;
            } else if (nums[i] == el) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return el;
    }
}
