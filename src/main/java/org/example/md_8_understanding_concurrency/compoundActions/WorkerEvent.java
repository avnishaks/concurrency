package org.example.md_8_understanding_concurrency.compoundActions;

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
