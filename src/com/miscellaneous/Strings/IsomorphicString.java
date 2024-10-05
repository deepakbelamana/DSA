package com.miscellaneous.Strings;

import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sh = new HashMap<>();
        HashMap<Character,Character> th = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if((sh.containsKey(cs) && sh.get(cs)!=ct) || (th.containsKey(ct)
                    && th.get(ct) != cs)) {
                return false;
            }
            sh.put(cs,ct);
            th.put(ct,cs);
        }
        return true;
    }
}
