package org.example.md_3_design_principle.design_4_ISP.voilations;

public class AllRounder implements Players{

    @Override
    public void bat() {
        System.out.println("Batting in Progress ..........");
    }

    @Override
    public void bowl() {
        System.out.println("Bowling in progress ............");
    }

    @Override
    public void keep() {
        System.out.println("Keeping in progress ..............");
    }

    @Override
    public void field() {
        System.out.println("Feilding in progress ..............");
    }
}
