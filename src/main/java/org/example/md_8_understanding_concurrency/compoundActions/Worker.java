package org.example.md_8_understanding_concurrency.compoundActions;

public class Worker implements Runnable{
    public final Number number;

    public Worker(Number number){
        this.number=number;
    }

    @Override
    public void run(){
       for(int i=0;i<1000000;i++){
           number.increment();
       }
    }
}
