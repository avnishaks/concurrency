package org.example.md_8_understanding_concurrency.callStack;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        throw new RuntimeException("Error message in running the MyRunnable Class");
    }
}
