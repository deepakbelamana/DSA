package com.miscellaneous;

import java.util.Set;
import java.util.TreeSet;

public class findMissingAndRepeatedValue {
    public static void main(String[] args) {
        int [] r = findMissingAndRepeatedValues(new int[][]{{1,3},{2,2}});
    }

    static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int len = grid[0].length;
        Set<Integer> s = new TreeSet<Integer>();
        for(int i=0;i<len;i++) {
            for(int j=0;j<len;j++) {
                s.add(grid[i][j]);
            }
        }
        Object[] sa = s.toArray();

        for (Object value : sa) {
            int nex = ((int) value) - 1;
            if ((int) value != nex) {
                res[1] = ((int) value) + 1;
                break;
            }
        }

        for (Object o : sa) {
            int nex = ((int) o) + 1;
            if ((int) o == nex) {
                res[0] = ((int) o);
                break;
            }
        }

        return res;
    }
}
