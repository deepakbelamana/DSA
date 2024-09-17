package com.miscellaneous.Main;

import com.miscellaneous.Arrays.*;
import com.miscellaneous.BinarySearch.SearchInTwoDArr;
import com.miscellaneous.BinarySearch.SingleElementInSortedArray;
import com.miscellaneous.sorting.CheckSortedAndRotated;
import com.miscellaneous.sorting.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(SearchInTwoDArr.searchMatrix(new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        },13));

    }
}
