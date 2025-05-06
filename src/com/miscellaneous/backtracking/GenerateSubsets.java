package com.miscellaneous.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {

    public static List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> ans  = new ArrayList<>();
        ans.add(new ArrayList<>());
        List<Integer> res = new ArrayList<>();
        int n = a.length;
        for(int i=0;i<n;i++){
            res.clear();
            generate(res,a,i,n,ans);
        }
        return ans;
    }

    static void generate(List<Integer> res, int[] a, int i, int n, List<List<Integer>> ans){
        if((res.isEmpty() || res.size()<n) && i<n ){
            res.add(a[i]);
            ans.add(new ArrayList<>(res));
            for(int j=i+1;j<n;j++) {
                generate(res,a,j,n,ans);
            }
            res.remove(Integer.valueOf(a[i]));
        }

        return;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = subsets(new int[]{1,2,3});
        System.out.println(result);
    }

}
