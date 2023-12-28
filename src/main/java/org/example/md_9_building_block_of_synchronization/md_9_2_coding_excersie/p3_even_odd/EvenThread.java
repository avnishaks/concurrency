package org.example.md_9_building_block_of_synchronization.md_9_2_coding_excersie.p3_even_odd;

public class EvenThread implements Runnable{

    private final String type;

    private final Object lock;

    public EvenThread(String type,Object lock){
        this.type=type;
        this.lock=lock;
    }

    @Override
    public void run(){
        while (compare()){
            synchronized (lock){
                if(EvenOddSimulator.curr%2==0){
                    System.out.println(type+"  "+EvenOddSimulator.curr);
                    EvenOddSimulator.curr++;
                }
            }
        }
    }

    private boolean compare(){
        synchronized (lock){
            return EvenOddSimulator.curr<=EvenOddSimulator.limit;
        }
    }
}
