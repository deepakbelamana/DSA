package com.customStack;

import java.util.Stack;

public class SortStack {
    public Stack<Integer> sort(Stack<Integer> s)
    {
        Stack<Integer> st = new Stack<>();
        while(!s.empty())
        {
            if(st.empty())
            {
                st.push(s.pop());
            }
            else{
                if(s.peek()<st.peek())
                {
                    st.push(s.pop());
                }
                else
                {
                    int nextElement = s.pop();
                    while(st.peek()<nextElement)
                    {
                        int stPop=st.pop();
                        if(st.empty())
                        {
                            s.push(stPop);
                            break;
                        }
                        s.push(stPop);
                    }
                    st.push(nextElement);
                }
            }
        }
        return st;
    }
}
