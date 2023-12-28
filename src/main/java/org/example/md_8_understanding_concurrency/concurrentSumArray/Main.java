package org.example.md_8_understanding_concurrency.concurrentSumArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static AtomicLong sum=new AtomicLong(0);
    public static AtomicInteger cnt=new AtomicInteger(0);


    private static void seqSum(List<Integer> nums){
        int local_sum=0;
        for(int i=0;i<10000000;i++){
            local_sum+=nums.get(i);
        }
        System.out.println("The sum value of the list in the sequential manner is : "+ local_sum);
    }

    private static void concurrentSum(List<Integer> nums) {
        int size=10000000/4;
        Thread t1=new Thread(new Worker(nums,0,size-1));
        Thread t2=new Thread(new Worker(nums,size,2*size-1));
        Thread t3=new Thread(new Worker(nums,2*size,3*size-1));
        Thread t4=new Thread(new Worker(nums,3*size,4*size-1));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

//        int size=nums.size()/4;
//        int segSize=4;
//        int startValue=0,endValue=0;
//        for(int i=0;i<segSize;i++){
//           startValue=i*size;
//           endValue=(i+1)*(size-1);
//           Thread thread=new Thread(new Worker(nums,startValue,endValue));
//           thread.start();
//        }

        while (cnt.get()<4){
           // System.out.println("Thread goes in Busy waiting cycle");
        }
        System.out.println("The sum value in concurrent manner is : "+ sum.get());
    }

    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10000000;i++){
            nums.add(random.nextInt());
        }

        long start2=System.currentTimeMillis();
        seqSum(nums);
        long end2=System.currentTimeMillis();
        System.out.println("The diff of start2 and end2 is : "+ (end2-start2));


        long start1=System.currentTimeMillis();
        concurrentSum(nums);
        long end1=System.currentTimeMillis();
        System.out.println("The diff of the start1 and end1 is : "+ (end1-start1));
    }
}
