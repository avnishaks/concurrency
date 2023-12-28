package org.example.concurrencyPPA.compoundActions;

import java.util.Arrays;
import java.util.List;

public class EventTittle {

    private static final List<String> title= Arrays.asList("DSA","LLD","Concurrency","HLD","React DEV");

    private int counter=0;

    public synchronized void next(){
        counter=(counter+1)%title.size();
    }

    public String getTittle(){
        return title.get(counter);
    }
}
