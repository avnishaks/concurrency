package org.example.md_3_design_principle.design_2_OCP.correctOCP;

public class IronMan implements SuperHero{
    @Override
    public void attack(){
        System.out.println("IronMan is attacking......");
    }
}
