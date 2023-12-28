package org.example.md_9_building_block_of_synchronization.md_9_2_coding_excersie.p2_challenge_2;


public class Worker implements Runnable{

    private Object lock;
    private final int val;


    public Worker(int val, Object lock){
        this.val=val;
        this.lock=lock;

    }
    @Override
    public void run(){
        while (true){
            while (compare()){}
            synchronized (lock){
                if(Main.rounds==0) break;
                System.out.println(val);
                Main.curr=(Main.curr+1)%10;
                if(Main.curr==0) Main.rounds --;
            }
        }
    }

    private boolean compare(){
        boolean ans=false;
        synchronized (lock){
            ans=!(val== Main.curr) && !(Main.rounds==0);
        }
        return ans;
    }
}
