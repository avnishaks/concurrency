package org.example.concurrencyPPA.raceconditionLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        NumberStores numberStores=new NumberStores();
        Thread t1=new Thread(new Worker(numberStores));
        Thread t2=new Thread(new Worker(numberStores));

        t1.start();
        t2.start();
        t1.join();
        t2.join();


        System.out.println(numberStores.getX());

    }
}
