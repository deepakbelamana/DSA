package com.miscellaneous;

public class AdjacentZeros {
    public static void main (String[] args) throws java.lang.Exception
    {
            String bi = "10000";
            String ans="No";
            int j=0;
            while (j < bi.length()) {
                if (bi.charAt(j) == '0' && bi.charAt(j) == bi.charAt(j + 1)) {
                    ans = "Yes";
                    break;
                }
                j++;
            }
            System.out.println(ans);
        }
}

