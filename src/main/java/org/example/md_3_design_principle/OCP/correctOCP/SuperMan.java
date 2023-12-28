package org.example.md_3_design_principle.OCP.correctOCP;

public class SuperMan implements SuperHero{
    @Override
    public void attack(){
        System.out.println("Super Man is attacking......");
    }
}
