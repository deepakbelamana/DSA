package com.miscellaneous;

import java.awt.*;
import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {


    public static void main(String[] args) {
       /* Stack<Character> st = new Stack<>();
        //{([a+b*(c+d)])};
      *//*  ( - 40, )-41

                [-91 ]-93

        { -123

        }-125*//*
        String s="{([a+b*(c+d)]}";
        for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if((int)c==40 || (int)c==91 || (int)c==123){
                    st.push(c);
                }
                else{
                     if((int)c==41){
                         if(st.pop()!=40){
                             System.out.println("false");
                         }
                     } else if((int)c==93){
                         if(st.pop()!=91){
                             System.out.println("false");
                         }
                     } else if((int)c==125){
                         if(st.pop()!=123){
                             System.out.println("false");
                         }
                     }
                }

        }*/

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //Tech1nology10
        int stc=0;
        int ntc=0;
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isDigit(s.charAt(i))){
               continue;
            } else{
                String leftPart = s.substring(0,i);
                String rightPart = s.substring(i+1,s.length());
                //rightPart : 10;

            }
        }
        //return false
    }
}
