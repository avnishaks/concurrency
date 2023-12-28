package org.example.md_9_building_block_of_synchronization.md_9_2_coding_excersie.p4_even_odd_multiple_thread;

public class MutliEvenThread implements Runnable{
    private final String type;

    private final Object lock;

    public MutliEvenThread(String type,Object lock){
        this.type=type;
        this.lock=lock;
    }

    @Override
    public void run(){
        while (compare()){
            synchronized (lock){
                if(MultiOddEvenSimulator.curr%2==0){
                    System.out.println(type+"   "+MultiOddEvenSimulator.curr);
                    MultiOddEvenSimulator.curr++;
                }
            }
        }
    }

    private boolean compare(){
        synchronized (lock){
            return MultiOddEvenSimulator.curr<=MultiOddEvenSimulator.limit;
        }
    }
}
