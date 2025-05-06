package com.miscellaneous.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetsDup {

    public  static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subl = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            subl.clear();
            solve(nums, i, res, nums.length,subl);
        }
        return res;
    }

    static void solve(int[] nums, int index, List<List<Integer>> res, int n, List<Integer> subl) {
        if ((subl.isEmpty() || index<n) ) {
            subl.add(nums[index]);
            if(!res.contains(subl)){
                res.add(new ArrayList<>(subl));
            }
            for(int i =index+1;i<n;i++) {
                solve(nums, i, res, n, subl);
            }
            subl.remove(Integer.valueOf(nums[index]));
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }
}
