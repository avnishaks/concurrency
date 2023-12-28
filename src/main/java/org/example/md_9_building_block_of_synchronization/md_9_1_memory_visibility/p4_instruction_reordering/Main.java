package org.example.md_9_building_block_of_synchronization.md_9_1_memory_visibility.p4_instruction_reordering;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumberStores numberStores=new NumberStores();
        for(int i=0;i<10000;i++){
            Thread t=new Thread(new Workers(numberStores));
            int curr=numberStores.getW();
            t.start();
            while (curr==numberStores.getW()) {}
            if(!(numberStores.getX()== numberStores.getY() && numberStores.getY()==numberStores.getZ() && numberStores.getZ()==numberStores.getW())){
                System.out.println(
                        numberStores.getX()+ "  " + numberStores.getY()+ "  "+ numberStores.getZ()+  "   " + numberStores.getW()
                );
            }
            t.join();
        }
    }
}
