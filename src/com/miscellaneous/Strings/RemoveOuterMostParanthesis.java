package com.miscellaneous.Strings;

import java.util.Stack;

public class RemoveOuterMostParanthesis {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String r="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
                if(st.size()>1){
                    r+='(';
                }
            } else{
                st.pop();
                if(st.size()!=0){
                    r+=')';
                }
            }
        }
        return r;
    }
}
