package org.example.md_9_building_block_of_synchronization.md_9_2_coding_excersie.p1_challenge_1;

public class Worker implements Runnable{

    private Object lock;
    private final int val;

    private int rounds;

    public Worker(int val,Object lock,int rounds){
        this.val=val;
        this.lock=lock;
        this.rounds=rounds;
    }
    @Override
    public void run(){
        while (rounds>0){
            while (compare()){}
            System.out.println(val);
            synchronized (lock){
                Main.curr=(Main.curr+1)%10;
            }
            rounds--;
        }
    }

    private boolean compare(){
        boolean ans=false;
        synchronized (lock){
            ans=!(val==Main.curr);
        }
        return ans;
    }
}
