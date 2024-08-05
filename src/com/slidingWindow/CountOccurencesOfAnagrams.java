package com.slidingWindow;

public class CountOccurencesOfAnagrams {

       public static int search(String pat, String txt) {
            int n=txt.length();
            int k=pat.length();
            int l=0;
            int patsum=0;
            while(l<k)
            {
                patsum+=(int)pat.charAt(l);
                l+=1;
            }
            int anagCount=0;
            int j=0;
            int i=j;
            int tempSum=0;
            while(j<n){
                tempSum+=(int)txt.charAt(j);
                if(j-i+1==k)
                {
                    if(tempSum==patsum){
                        anagCount++;
                    }
                    tempSum-=(int)txt.charAt(i);
                    i++;
                }
                j++;
            }
            return anagCount;
        }
}
