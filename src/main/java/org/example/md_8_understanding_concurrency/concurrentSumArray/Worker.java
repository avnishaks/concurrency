package org.example.md_8_understanding_concurrency.concurrentSumArray;

import java.util.List;

public class Worker implements Runnable{

    private final List<Integer> nums;

    private final int start,end;

    public Worker(List<Integer> nums, int start, int end){

        this.nums = nums;
        this.start = start;
        this.end = end;
    }


    @Override
    public void run(){
        long local_sum=0;
        for(int i=start;i<=end;i++){
            local_sum+=nums.get(i);
        }

        Main.sum.addAndGet(local_sum);
        Main.cnt.incrementAndGet();
    }

}
