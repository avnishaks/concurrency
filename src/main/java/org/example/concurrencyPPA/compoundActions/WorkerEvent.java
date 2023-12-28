package org.example.concurrencyPPA.compoundActions;

public class WorkerEvent implements Runnable{

    private final EventContainer eventContainer;

    public  WorkerEvent(EventContainer eventContainer){
        this.eventContainer=eventContainer;
    }
    @Override
    public void run(){
        eventContainer.increment();
    }
}
