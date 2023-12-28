package org.example.md_9_building_block_of_synchronization.md_9_1_memory_visibility.p4_instruction_reordering;

public class Workers implements Runnable{

    private final NumberStores numberStores;

    public Workers(NumberStores numberStores){
        this.numberStores=numberStores;
    }
    @Override
    public void run(){
        numberStores.increment();
    }
}
