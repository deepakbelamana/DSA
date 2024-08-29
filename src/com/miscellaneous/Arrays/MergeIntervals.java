package com.miscellaneous.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(arr.isEmpty() || intervals[i][0] > arr.get(arr.size()-1) ){
                arr.add(intervals[i][0]);
                arr.add(intervals[i][1]);
            } else {
                if(arr.get(arr.size()-1)>=intervals[i][0]){
                    arr.set(arr.size()-1,Math.max(intervals[i][1],
                            arr.get(arr.size()-1)));
                }
            }
        }
        int[][] res= new int[(arr.size()/2)][2];
        int r=0;
        for(int al=0;al<arr.size();al+=2){
            res[r][0]=arr.get(al);
            res[r][1]=arr.get(al+1);
            r++;
        }
        return res;
    }
}
