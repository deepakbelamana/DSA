package com.slidingWindow;
import java.util.*;
public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k){
        int i=0;
        int j=i;
        List<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        while(j<nums.length)
        {
            if(dq.isEmpty()){
                dq.add(j);
            }
            else{
                if (nums[dq.getLast()]<nums[j]){
                    dq.removeLast();
                    dq.addLast(j);
                } else {
                    dq.addLast(j);
                }
            }
            if(j-i+1==k)
            {
                i++;
                res.add(nums[dq.peek()]);
                for (Iterator itr = dq.descendingIterator();
                     itr.hasNext();) {
                    int remVal = (int)itr.next();
                    if(remVal<i){
                        dq.removeFirst();
                    }
                }
            }
            j++;

        }
        return res.stream().mapToInt(r->r).toArray();
    }
}
