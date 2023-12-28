package org.example.md_9_building_block_of_synchronization.md_9_2_coding_excersie.p3_even_odd;

public class EvenOddSimulator {
    public static int curr=1;
    public static final int limit=20;
    public static void main(String[] args) {
        Object lock=new Object();
        Thread oddThread=new Thread(new OddThread("odd",lock));
        Thread evenThread=new Thread(new EvenThread("even",lock));

        oddThread.start();
        evenThread.start();
    }
}
