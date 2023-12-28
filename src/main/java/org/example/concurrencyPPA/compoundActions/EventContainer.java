package org.example.concurrencyPPA.compoundActions;

public class EventContainer {
    private final EventTittle eventTittle;
    private final EventSyllabus eventSyllabus;

    public EventContainer(EventTittle eventTittle, EventSyllabus eventSyllabus){
        this.eventTittle=eventTittle;
        this.eventSyllabus =eventSyllabus;
    }

    public synchronized void increment(){
        eventTittle.next();
        eventSyllabus.next();
    }

    public synchronized String getTittleSubject(){
        String s="Tittle of the Subject : " +eventTittle.getTittle()+ "  |||   "+ " Core topic included : " + eventSyllabus.getSyllabus();
        return  s;
    }
}
