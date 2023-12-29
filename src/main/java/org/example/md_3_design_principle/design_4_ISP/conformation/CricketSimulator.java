package org.example.md_3_design_principle.design_4_ISP.conformation;

import java.util.Arrays;
import java.util.List;

public class CricketSimulator {

    public final List<PureBatsman> pureBatsmen;
    public final List<AllRounder> allRounders;

    public final WicketKeeper wicketKeeper;

    public final CricketHelper cricketHelper;


    public CricketSimulator(List<PureBatsman> pureBatsmen, List<AllRounder> allRounders, WicketKeeper wicketKeeper, CricketHelper cricketHelper) {
        this.pureBatsmen = pureBatsmen;
        this.allRounders = allRounders;
        this.wicketKeeper = wicketKeeper;
        this.cricketHelper = cricketHelper;
    }

    public void stimulate(){
        System.out.println("Stimulation Started ........");

        System.out.println("   ");
        System.out.println("   ");

        System.out.println("BATTING");

        System.out.println("   ");
        System.out.println("   ");

        startBatting();

        System.out.println("   ");
        System.out.println("   ");

        System.out.println("BOWLING");

        System.out.println("   ");
        System.out.println("   ");


        startBowling();

        System.out.println("   ");
        System.out.println("   ");

        System.out.println("FIELDING");

        System.out.println("   ");
        System.out.println("   ");

        startFielding();

        System.out.println("   ");
        System.out.println("   ");

        System.out.println("KEEPING");

        System.out.println("   ");
        System.out.println("   ");

        startKeeping();

        System.out.println("Stimulation Ended ...........");
    }

    public void startBatting(){
        for(int i=0;i<pureBatsmen.size();i++){
            cricketHelper.bat(pureBatsmen.get(i));
        }
        cricketHelper.bat(wicketKeeper);
        for(int i=0;i<allRounders.size();i++){
            cricketHelper.bat(allRounders.get(i));
        }
    }

    public void startBowling(){
        for(int i=0;i<allRounders.size();i++){
            cricketHelper.bowl(allRounders.get(i));
        }
    }

    public void startFielding(){
        for(int i=0;i<pureBatsmen.size();i++){
            cricketHelper.field(pureBatsmen.get(i));
        }
        for(int i=0;i<allRounders.size();i++){
            cricketHelper.field(allRounders.get(i));
        }
    }

    public void startKeeping(){
        cricketHelper.keep(wicketKeeper);
    }


    public static void main(String[] args) {
        List<PureBatsman> pureBatsmen1= Arrays.asList(new PureBatsman(),new PureBatsman(),new PureBatsman(),new PureBatsman());
        List<AllRounder> allRounders1=Arrays.asList(new AllRounder(),new AllRounder(),new AllRounder(),new AllRounder(),new AllRounder(),new AllRounder());
        WicketKeeper wicketKeeper1=new WicketKeeper();
        CricketHelper cricketHelper1=new CricketHelper();
        CricketSimulator cricketSimulator=new CricketSimulator(pureBatsmen1,allRounders1,wicketKeeper1,cricketHelper1);
        cricketSimulator.stimulate();
    }
}
