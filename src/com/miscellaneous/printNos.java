package com.miscellaneous;

public class printNos {
    public void printNos(int n)
    {
        if(n==0){
            return ;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }
}
