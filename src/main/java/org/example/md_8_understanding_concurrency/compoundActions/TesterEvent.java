package org.example.md_8_understanding_concurrency.compoundActions;

public class TesterEvent {
    public static void main(String[] args) throws InterruptedException {
        EventContainer container=new EventContainer(new EventTittle(),new EventSyllabus());
        System.out.println(container.getTittleSubject());

        Thread t1=new Thread(new WorkerEvent(container));
        t1.start();
        Thread.sleep(200);
        System.out.println(container.getTittleSubject());
    }
}
