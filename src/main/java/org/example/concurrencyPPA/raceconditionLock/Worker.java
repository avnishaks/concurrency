package org.example.concurrencyPPA.raceconditionLock;

public class Worker implements Runnable{

    private final NumberStores numberStores;

    public Worker(NumberStores numberStores){
        this.numberStores=numberStores;
    }

    @Override
    public void run(){
        for(int i=0;i<1000000;i++){
            numberStores.increment();
        }
    }
}
