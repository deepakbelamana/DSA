package com.miscellaneous.Strings;

import java.util.Stack;

public class MaxDepth {
    public static int maxDepth(String s) {
        int depth=Integer.MIN_VALUE;
        int count=0;
        int dec=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                depth=Math.max(count,depth);
                dec++;
                st.pop();
            }
            if(c=='('){
                count=count-dec;
                count++;
                dec=0;
                st.push(c);
            }
            if(st.empty()){
                depth=Math.max(count,depth);
            }
            depth=Math.max(count,depth);
        }
        return depth;
    }
}
