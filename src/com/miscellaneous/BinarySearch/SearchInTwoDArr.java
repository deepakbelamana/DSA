package com.miscellaneous.BinarySearch;

public class SearchInTwoDArr {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] start = new int[]{0,0};
        int[] end = new int[]{m-1,n-1};
        while(start[0]<=end[0]){
            int distance=end[0]*(n)+(end[1]+1)-(start[1]);
            int midDistance=distance/2;
            int[] mid = new int[2];
            int i=start[0];
            int j=start[1];
            for(int k=0;k<midDistance;k++){
                j++;
                if(j>n-1){
                    j=0;
                    i++;
                }
            }
            mid[0]=i;
            mid[1]=j;
            if(matrix[mid[0]][mid[1]]==target){
                return true;
            }
            if(matrix[mid[0]][mid[1]]<target){
                start[0]=mid[0];
                start[1]=mid[1]+1;
            }
            else if(matrix[mid[0]][mid[1]]>target){
                end[0]=mid[0];
                end[1]=mid[1]-1;
            }
        }
        return false;
    }
}
