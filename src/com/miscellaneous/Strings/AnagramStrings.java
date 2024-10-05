package com.miscellaneous.Strings;

import java.util.HashMap;

public class AnagramStrings {
    public static boolean isAnagrams(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> sh = new HashMap<>();
        HashMap<Character,Integer> th = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            if(sh.containsKey(cs)){
                sh.put(cs,sh.get(cs)+1);
            } else{
                sh.put(cs,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ct = t.charAt(i);
            if(th.containsKey(ct)){
                th.put(ct,th.get(ct)+1);
            } else{
                th.put(ct,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ct = t.charAt(i);

            if(!(sh.containsKey(ct))){
                return false;
            } else {
                int is=sh.get(ct);
                int it=th.get(ct);
                if(is!=it){
                    return false;
                }
            }
        }
        return true;
    }
}
