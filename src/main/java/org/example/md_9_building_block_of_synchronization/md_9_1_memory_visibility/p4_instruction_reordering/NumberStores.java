package org.example.md_9_building_block_of_synchronization.md_9_1_memory_visibility.p4_instruction_reordering;

public class NumberStores {

    private int x,y,z,w;

    public NumberStores(){
        this.x=0;
        this.y=0;
        this.z=0;
        this.w=0;
    }

    public synchronized void increment(){
        x++;
        y++;
        z++;
        w++;
    }

    public synchronized int getX(){
        return x;
    }

    public synchronized int getY(){
        return  y;
    }

    public synchronized int getZ(){
        return z;
    }

    public synchronized int getW(){
        return  w;
    }
}


/*
All the blocks of reader and writer functions are in synchronized block
 */