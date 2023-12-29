package org.example.md_3_design_principle.design_4_ISP.conformation;

public class CricketHelper {
    public void bat(Batsman batsman){
        batsman.bat();
    }
    public void bowl(Bowler bowler){
        bowler.bowl();
    }

    public void field(Fielder fielder){
        fielder.field();
    }

    public void keep(Keeper keeper){
        keeper.keep();
    }

}
