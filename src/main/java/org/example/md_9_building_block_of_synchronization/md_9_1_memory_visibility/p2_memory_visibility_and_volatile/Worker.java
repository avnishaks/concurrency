package org.example.md_9_building_block_of_synchronization.md_9_1_memory_visibility.p2_memory_visibility_and_volatile;


public class Worker implements Runnable{

    private final int val;

    public Worker(int val){
        this.val=val;
    }

    @Override
    public void run(){
        // When we asked to print number in sorted order if all number passed to different thread , we check curr value with thread value
        // if the value of curr is in process is less than passed value in thread , we sent in pending state.
        while (val> Main.curr){}
        System.out.println(val);
        Main.curr++;
    }
}
