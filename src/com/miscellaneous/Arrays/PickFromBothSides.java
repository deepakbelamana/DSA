package com.miscellaneous.Arrays;

import java.util.ArrayList;

public class PickFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int leftSum = 0;
        int maxSum = 0;
        for (int i = 0; i < B; i++) {
            leftSum += A.get(i);
            maxSum = leftSum;
        }
        for (int i = B - 1, j = n - 1; i >= 0; i--, j--) {
            leftSum -= A.get(i);
            leftSum += A.get(j);
            maxSum = Math.max(maxSum, leftSum);
        }
        return maxSum;
    }
}
