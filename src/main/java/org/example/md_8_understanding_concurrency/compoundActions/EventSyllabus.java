package org.example.md_8_understanding_concurrency.compoundActions;

import java.util.Arrays;
import java.util.List;

public class EventSyllabus {

    private static final List<String> syllabus= Arrays.asList(
            "Maths, DP , Graph, Linked List, String , Array",
            "SOLID Principle and Design Pattern",
            "Locking",
            "Caching",
            "Asynchronous JavaScript"
    );

    private int counter=0;

    public synchronized void next(){
        counter=(counter+1)%syllabus.size();
    }

    public String getSyllabus(){
        return syllabus.get(counter);
    }
}
