package com.miscellaneous.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayWithSquares {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            int rs = (int) Math.pow(A.get(i), 2);
            if (!res.contains(rs)) {
                res.add(rs);
            }
        }
        Collections.sort(res);
        return res;
    }
}
