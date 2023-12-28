package org.example.md_8_understanding_concurrency;

public class ReverseSequencer implements Runnable{
    @Override
    public void run(){
        for(int i=9;i>=0;i--){

            System.out.println("Reverse Sequencer called " +i+" ");
        }
    }
}
