package org.example.md_3_design_principle.design_4_ISP.conformation;

public class PureBatsman implements Batsman,Fielder{
    @Override
    public void bat() {
        System.out.println("Pure Batsman Batting : Batsman finished developing its own orthodox shot , creating V behind the wicket..........");
    }

    @Override
    public void field() {
        System.out.println("Pure Batsman Fielding : Jonn ty Rodes seems to back in action in the body of Shubham Gill ");
    }

}
