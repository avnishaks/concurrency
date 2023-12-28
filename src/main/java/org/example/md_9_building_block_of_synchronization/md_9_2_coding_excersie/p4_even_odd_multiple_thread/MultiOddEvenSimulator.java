package org.example.md_9_building_block_of_synchronization.md_9_2_coding_excersie.p4_even_odd_multiple_thread;


public class MultiOddEvenSimulator {

    public static int curr=1;

    public static final int limit=20;
    public static void main(String[] args) {
        Object lock=new Object();
        Thread odd1Thread=new Thread(new MultiOddThread("odd1",lock));
        Thread odd2Thread=new Thread(new MultiOddThread("odd2",lock));
        Thread even1Thread=new Thread(new MutliEvenThread("even1",lock));
        Thread even2Thread=new Thread(new MutliEvenThread("even2",lock));

        odd1Thread.start();
        odd2Thread.start();
        even1Thread.start();
        even2Thread.start();

    }
}
