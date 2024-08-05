package com.customStack;

import java.util.ArrayList;

public class CustomStack {

    int top;
    ArrayList<Integer> st=null;
    int size;
    public CustomStack(int maxSize) {
        st = new ArrayList<Integer>(maxSize);
        size=maxSize;
        top=-1;
    }

    public void push(int x) {
        if(st.size()!=size)
        {
            top++;
            st.add(top,x);
        }
    }

    public int pop() {
        if(st.size()==0)
        {
            return -1;
        }
        else {
            int popElement = st.get(top);
            st.remove(top);
            top--;
            return popElement;
        }
    }

    public void increment(int k, int val) {
        if(st.size()>k)
        {
            for(int i=0;i<k;i++)
            {
                st.set(i,st.get(i)+val);
            }
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                st.set(i,st.get(i)+val);
            }
        }
    }

}
