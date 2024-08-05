package com.hashTable;
import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs = new HashMap<>();
        List<List<String>> resList = new ArrayList<>();
        for(String s : strs){
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            String sortS=new String(tempArray);
            List<String> tempS = new ArrayList<>();
            if(hs.containsKey(sortS))
            {
                tempS = hs.get(sortS);
                tempS.add(s);
            } else {
                tempS.add(s);
                hs.put(sortS,tempS);
            }
        }
        hs.forEach((k,v)->resList.add(v));
        return resList;
    }


}
