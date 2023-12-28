package org.example.md_9_building_block_of_synchronization.md_9_1_memory_visibility.p2_memory_visibility_and_volatile;


public class Main {


    // Here in curr value is made volatile , as some cache mechanism may occur in CPU , so to avoid cache read volatile
    // keyword is used
    public static volatile int curr=1;
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Worker(1));
        Thread t3=new Thread(new Worker(3));
        Thread t4=new Thread(new Worker(4));
        Thread t5=new Thread(new Worker(5));
        Thread t2=new Thread(new Worker(2));
        Thread t6=new Thread(new Worker(6));
        Thread t7=new Thread(new Worker(7));
        Thread t8=new Thread(new Worker(8));
        Thread t9=new Thread(new Worker(9));
        Thread t10=new Thread(new Worker(10));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
