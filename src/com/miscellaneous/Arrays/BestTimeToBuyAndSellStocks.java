package com.miscellaneous.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] a) {
        int minSoFar=a[0];
        int maxProfit=0;

        for(int i=1;i<a.length;i++)
        {
            minSoFar=Math.min(a[i],minSoFar);
            maxProfit=Math.max(maxProfit,a[i]-minSoFar);
        }
        return maxProfit;
    }
}
