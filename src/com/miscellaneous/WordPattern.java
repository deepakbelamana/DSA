package com.miscellaneous;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        int _sp=0;
        if(s.equals(pattern)){
            if(s.length()==1){
                return true;
            }
            return false;
        }
        for(char c:s.toCharArray()){
            if(c==' '){
                _sp++;
            }
        }
        if(_sp>=pattern.length()){
            return false;
        }

        HashMap<String, Character> hm = new HashMap<>();
        HashMap<Character, Boolean> bm = new HashMap<>();
        String tm = "";
        int pt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (hm.containsKey(tm)) {
                    if (hm.get(tm) != pattern.charAt(pt)) {
                        return false;
                    } else {
                        pt += 1;
                        tm = "";
                    }
                } else {
                    if (bm.containsKey(pattern.charAt(pt)) &&
                            bm.get(pattern.charAt(pt)) == true) {
                        return false;
                    }
                    hm.put(tm, pattern.charAt(pt));
                    tm = "";
                    bm.put(pattern.charAt(pt), true);
                    pt += 1;
                }
            } else {
                tm += s.charAt(i);
            }
        }
        if (tm != " ") {
            if (hm.containsKey(tm)) {
                if (hm.get(tm) != pattern.charAt(pt)) {
                    return false;
                }
            } else {
                if (bm.containsKey(pattern.charAt(pt)) &&
                        bm.get(pattern.charAt(pt)) == true) {
                    return false;
                }
            }
        }


        return true;
    }


    public static void main(String[] args) {
        System.out.println(wordPattern("he", "unit"));
    }
}
