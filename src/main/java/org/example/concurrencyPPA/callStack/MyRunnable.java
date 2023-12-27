package org.example.concurrencyPPA.callStack;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        throw new RuntimeException("Error message in running the MyRunnable Class");
    }
}
