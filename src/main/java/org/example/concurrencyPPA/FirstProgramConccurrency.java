package org.example.concurrencyPPA;

public class FirstProgramConccurrency {
    public static void main(String[] args) {
        System.out.println("Starting the main method");

        Thread t1=new Thread(new Sequencer());
        Thread t2=new Thread(new ReverseSequencer());

        t1.start();
        t2.start();

        for(int i=100;i<110;i++){
            System.out.println("For Loop in the main method "+ i);
        }
    }
}
