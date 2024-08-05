package com.slidingWindow;
import java.util.*;
public class FirstNegativIntegerInWindowK {
    public long[] printFirstNegativeInteger(long a[], int N, int k)
    {
        long i=0;
        long j=i;
        List<Long>res=new ArrayList<>();
        Queue<Long> q = new ArrayDeque<>();
        while(j<N)
        {
            if(a[(int)j]<0) {
                q.add(a[(int)j]);
            }
            if(j==i+k-1)
            {
                i++;
                j=i;
                if(q.isEmpty())
                {
                    res.add(0L);
                } else {
                    res.add(q.poll());
                    q.clear();
                }
            }
            else
            {
                j++;
            }
        }
        long[] r= res.stream().mapToLong(l -> l).toArray();
        return r;
    }
}
