package com.miscellaneous.BinarySearch;

public class SearchInTwoDArr {
    public boolean searchMatrix(int[][] matrix, int target) {
        int arrSize = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            arrSize++;
        }
        int[] oneD = new int[arrSize * matrix.length];
        int a = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                oneD[a] = matrix[i][j];
                a++;
            }
        }
        int start = 0;
        int end = oneD.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (oneD[mid] == target) {
                return true;
            }
            if (oneD[mid] > target) {
                end = mid - 1;
            } else if (oneD[mid] < target) {
                start = mid + 1;
            }
        }
        return false;
    }
}
