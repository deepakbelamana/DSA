package com.MinStack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    int min_val = Integer.MAX_VALUE;

    public MinStack() {
        this.st = new Stack<>();
    }

    public void push(int val) {
        if(val<this.min_val){
            this.min_val=val;
        }
        st.push(val);
    }

    public void pop() {
        if(!st.isEmpty()){
            int pop_element=st.pop();
            if(pop_element==this.min_val) {
                this.min_val=Integer.MAX_VALUE;
                Stack<Integer> tmp = new Stack<>();
                while(!st.isEmpty()){
                    tmp.push(st.pop());
                }
                while(!tmp.isEmpty()){
                    push(tmp.pop());
                }
            }
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return this.min_val;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */