package org.example.md_8_understanding_concurrency;

public class Sequencer implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Sequencer called " +i+" ");
        }
    }

}
