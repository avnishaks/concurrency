package org.example.md_9_building_block_of_synchronization.md_9_1_memory_visibility.p5_skipping_volatile;

import org.example.md_9_building_block_of_synchronization.md_9_1_memory_visibility.p1_danger_with_concurrency.Main;

public class Worker implements Runnable{

    private final int val;
    private Object lock;

    public Worker(int val,Object lock){
        this.val=val;
        this.lock=lock;
    }

    @Override
    public void run(){

        while (compare()){}
        System.out.println(val);
        synchronized (lock){
            Main.curr++;
        }

    }

    private boolean compare(){
        boolean ans=false;
        synchronized (lock){
            ans=(val>Main.curr);
        }
        return ans;
    }

}


/*

Problem :-


 @Override
    public void run(){
        synchronized (lock){
            while (val> Main.curr){}
        }

        System.out.println(val);
        synchronized (lock){
            Main.curr++;
        }

    }


 Solution :-


      @Override
    public void run(){

        while (compare()){}
        System.out.println(val);
        synchronized (lock){
            Main.curr++;
        }

    }

    private boolean compare(){
        boolean ans=false;
        synchronized (lock){
            ans=(val>Main.curr);
        }
        return ans;
    }

 */