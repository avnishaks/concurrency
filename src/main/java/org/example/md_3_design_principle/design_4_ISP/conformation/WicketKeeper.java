package org.example.md_3_design_principle.design_4_ISP.conformation;

public class WicketKeeper implements Batsman,Keeper{
    @Override
    public void bat() {
        System.out.println("WicketKeeper Batting : India gets another floater after MSD in terms of wicketkeeping RP i.e Rishabh Pant ..........");
    }

    @Override
    public void keep() {
        System.out.println("WicketKeeper Keeping : KL Rahul fills the gap of the MSD , turing DRS into India favour .........");
    }
}
