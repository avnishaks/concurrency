package org.example.md_3_design_principle.design_4_ISP.conformation;

public class AllRounder implements Batsman,Bowler,Fielder{
    @Override
    public void bat() {
        System.out.println("AllRounder Batting : HP is new AllRound after Haryana Harikans Kapil Dev");
    }

    @Override
    public void bowl() {
        System.out.println("All Rounder Bowling : RJ is new thing in India cricket especially in the test match series in Overseas conditions ");
    }

    @Override
    public void field() {
        System.out.println("All Rounder Fielding : Man with strong arm RJ itself currently world best fielder in the world" );
    }
}
