package org.example.md_8_understanding_concurrency.raceconditionLock;

public class NumberStores {

    private int x;

    private Object lock;

    public NumberStores(){
        this.x=0;
        this.lock=new Object();
    }

    public void increment(){
        synchronized (lock) {
            x++;
        }
    }


    public int getX(){
        return  x;
    }
}
